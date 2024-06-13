package src.AnalisadorSintatico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Ricardo André & Gustavo Melo
 * Unicap Icam-Tech
 * 20/05/2024
 */

public class Lexico {
    private char[] conteudo;
    private int indiceConteudo;

    public Lexico(String caminhoCodigoFonte) {
        try {
            String conteudoStr = new String(Files.readAllBytes(Paths.get(caminhoCodigoFonte)));
            this.conteudo = conteudoStr.toCharArray();
            this.indiceConteudo = 0;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // retorna o próximo char
    private char nextChar() {
        return this.conteudo[this.indiceConteudo++];
    }

    // checa se existe próximo char ou chegou no final do código
    private boolean hasNextChar() {
        return indiceConteudo < this.conteudo.length;
    }

    // volta o índice que aponta para o "char da vez" em uma unidade
    private void back() {
        this.indiceConteudo--;
    }

    // checa se o char é letra minúscula
    private boolean isLetra(char c) {
        return (c >= 'a') && (c <= 'z');
    }

    // checa se o char é dígito
    private boolean isDigito(char c) {
        return (c >= '0') && (c <= '9');
    }

    // retorna próximo token válido ou envia mensagem de erro
    public Token nextToken() {
        Token token = null;
        char c;
        int estado = 0;
        StringBuffer lexema = new StringBuffer();
        while (this.hasNextChar()) {
            c = this.nextChar();
            switch (estado) {
                case 0:
                    if (Character.isWhitespace(c)) {
                        if (c == '\n') {
                            return new Token("\\n", Token.TIPO_FIM_LINHA); // Adiciona reconhecimento de fim de linha
                        }
                        estado = 0;
                    } else if (c == '/') {
                        lexema.append(c);
                        estado = 21; // Mudança de estado para verificar se é comentário
                    } else if (this.isLetra(c) || c == '_') {
                        lexema.append(c);
                        estado = 1;
                    } else if (this.isDigito(c)) {
                        lexema.append(c);
                        estado = 2;
                    } else if ("(){};,[]".indexOf(c) != -1) {
                        lexema.append(c);
                        estado = 5;
                    } else if (c == '<' || c == '>') {
                        lexema.append(c);
                        estado = 8;
                    } else if (c == '=') {
                        lexema.append(c);
                        estado = 14;
                    } else if ("+-*/%".indexOf(c) != -1) {
                        lexema.append(c);
                        estado = 15;
                    } else if (c == '\'') {
                        lexema.append(c);
                        estado = 12;
                    } else if (c == ':') {
                        lexema.append(c);
                        estado = 10;
                    } else if (c == '@') {
                        lexema.append(c);
                        estado = 19;
                    } else if (c == '$') {
                        lexema.append(c);
                        estado = 99;
                        this.back();
                    } else {
                        lexema.append(c);
                        throw new RuntimeException("Erro: token inválido \"" + lexema.toString() + "\"");
                    }
                    break;
                case 1:
                    if (this.isLetra(c) || this.isDigito(c) || c == '_') {
                        lexema.append(c);
                        estado = 7;
                    } else {
                        this.back();
                        return new Token(lexema.toString(), Token.TIPO_IDENTIFICADOR);
                    }
                    break;
                case 2:
                    if (this.isDigito(c)) {
                        lexema.append(c);
                        estado = 2;
                    } else if (c == '.') {
                        lexema.append(c);
                        estado = 3;
                    } else {
                        this.back();
                        return new Token(lexema.toString(), Token.TIPO_INTEIRO);
                    }
                    break;
                case 3:
                    if (this.isDigito(c)) {
                        lexema.append(c);
                        estado = 4;
                    } else {
                        throw new RuntimeException("Erro: número float inválido \"" + lexema.toString() + "\"");
                    }
                    break;
                case 4:
                    if (this.isDigito(c)) {
                        lexema.append(c);
                        estado = 4;
                    } else {
                        this.back();
                        return new Token(lexema.toString(), Token.TIPO_REAL);
                    }
                    break;
                case 5:
                    this.back();
                    return new Token(lexema.toString(), Token.TIPO_CARACTER_ESPECIAL);
                case 6:
                    this.back();
                    return new Token(lexema.toString(), Token.TIPO_CHAR);
                case 7:
                    if (this.isDigito(c) || this.isLetra(c)) {
                        lexema.append(c);
                        estado = 7;
                    } else {
                        String lex = lexema.toString();
                        if (lex.equals("if") || lex.equals("else") || lex.equals("int") || lex.equals("float")
                                || lex.equals("char") || lex.equals("while") || lex.equals("main")) {
                            return new Token(lex, Token.TIPO_PALAVRA_RESERVADA);
                        } else {
                            this.back();
                            return new Token(lex, Token.TIPO_IDENTIFICADOR);
                        }
                    }
                    break;
                case 8:
                    if (c == '=' || c == '>') {
                        lexema.append(c);
                        estado = 9;
                    } else {
                        this.back();
                        return new Token(lexema.toString(), Token.TIPO_OPERADOR_RELACIONAL);
                    }
                    break;
                case 9:
                    this.back();
                    return new Token(lexema.toString(), Token.TIPO_OPERADOR_RELACIONAL);
                case 10:
                    if ("()".indexOf(c) != -1) {
                        lexema.append(c);
                        estado = 11;
                    }
                    break;
                case 11:
                    this.back();
                    return new Token(lexema.toString(), Token.EMOJI);
                case 12:
                    if (this.isDigito(c) || this.isLetra(c)) {
                        lexema.append(c);
                        estado = 13;
                    } else {
                        throw new RuntimeException("Erro: token inválido para tipo char \"" + lexema.toString() + "\"");
                    }
                    break;
                case 13:
                    if (c == '\'') {
                        lexema.append(c);
                        estado = 6;
                    } else {
                        throw new RuntimeException(
                                "Erro: token mal formatado para tipo char \"" + lexema.toString() + "\"");
                    }
                    break;
                case 14:
                    if (c == '=') {
                        lexema.append(c);
                        estado = 20;
                    } else {
                        this.back();
                        return new Token(lexema.toString(), Token.TIPO_OPERADOR_ATRIBUICAO);
                    }
                    break;
                case 15:
                    this.back();
                    return new Token(lexema.toString(), Token.TIPO_OPERADOR_ARITMETICO);
                case 16:
                    this.back();
                    return new Token(lexema.toString(), Token.TIPO_PALAVRA_RESERVADA);
                case 17:
                    if (this.isDigito(c) || this.isLetra(c)) {
                        lexema.append(c);
                        estado = 17;
                    } else if (c == '.') {
                        lexema.append(c);
                        estado = 18;
                    }
                    break;
                case 18:
                    if (this.isLetra(c)) {
                        lexema.append(c);
                        estado = 18;
                    } else {
                        this.back();
                        return new Token(lexema.toString(), Token.EMAIL);
                    }
                    break;
                case 19:
                    if (this.isLetra(c) || this.isDigito(c)) {
                        lexema.append(c);
                        estado = 19;
                    } else {
                        this.back();
                        return new Token(lexema.toString(), Token.MENCAO);
                    }
                    break;
                case 20:
                    this.back();
                    return new Token(lexema.toString(), Token.TIPO_OPERADOR_RELACIONAL);
                case 21:
                    if (c == '*') {
                        estado = 22;
                    } else {
                        this.back();
                        return new Token("/", Token.TIPO_OPERADOR_RELACIONAL);
                    }
                    break;
                case 22:
                    if (c == '*') {
                        estado = 23;
                    }
                    break;
                case 23:
                    if (c == '/') {
                        estado = 0;
                    } else if (c != '*') {
                        estado = 22;
                    }
                    break;
                case 99:
                    return new Token(lexema.toString(), Token.TIPO_FIM_CODIGO);
            }
        }
        return token;
    }
}