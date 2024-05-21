package src.AnalisadorSintatico;

/*
 * Ricardo André & Gustavo Melo
 * Unicap Icam-Tech
 * 20/05/2024
 */

public class Token {
    public static final int TIPO_INTEIRO = 0;
    public static final int TIPO_REAL = 1;
    public static final int TIPO_CHAR = 2;
    public static final int TIPO_IDENTIFICADOR = 3;
    public static final int TIPO_OPERADOR_RELACIONAL = 4;
    public static final int TIPO_OPERADOR_ARITMETICO = 5;
    public static final int TIPO_CARACTER_ESPECIAL = 6;
    public static final int TIPO_PALAVRA_RESERVADA = 7;
    public static final int TIPO_OPERADOR_ATRIBUICAO = 8;
    public static final int EMOJI = 9;
    public static final int EMAIL = 10;
    public static final int MENCAO = 11;
    public static final int TIPO_FIM_CODIGO = 99;
    public static final int TIPO_FIM_LINHA = 100;

    private int tipo; // tipo do token
    private String lexema; // conteúdo do token

    public Token(String lexema, int tipo) {
        this.lexema = lexema;
        this.tipo = tipo;
    }

    public String getLexema() {
        return this.lexema;
    }

    public int getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        switch (this.tipo) {
            case TIPO_INTEIRO:
                return this.lexema + " - INTEIRO";
            case TIPO_REAL:
                return this.lexema + " - REAL";
            case TIPO_CHAR:
                return this.lexema + " - CHAR";
            case TIPO_IDENTIFICADOR:
                return this.lexema + " - IDENTIFICADOR";
            case TIPO_OPERADOR_RELACIONAL:
                return this.lexema + " - OPERADOR_RELACIONAL";
            case TIPO_OPERADOR_ARITMETICO:
                return this.lexema + " - OPERADOR_ARITMETICO";
            case TIPO_CARACTER_ESPECIAL:
                return this.lexema + " - CARACTER_ESPECIAL";
            case TIPO_PALAVRA_RESERVADA:
                return this.lexema + " - PALAVRA_RESERVADA";
            case TIPO_OPERADOR_ATRIBUICAO:
                return this.lexema + " - OPERADOR_ATRIBUICAO";
            case EMOJI:
                return this.lexema + " - EMOJI";
            case EMAIL:
                return this.lexema + " - EMAIL";
            case MENCAO:
                return this.lexema + " - MENCAO";
            case TIPO_FIM_CODIGO:
                return this.lexema + " - FIM_CODIGO";
            case TIPO_FIM_LINHA:
                return this.lexema + " - FIM_LINHA";
            default:
                return "";
        }
    }
}
