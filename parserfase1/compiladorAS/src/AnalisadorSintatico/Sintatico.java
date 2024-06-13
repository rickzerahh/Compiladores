package src.AnalisadorSintatico;

import java.util.ArrayList;

/*
 * Ricardo André & Gustavo Melo
 * Unicap Icam-Tech
 * 20/05/2024
 * [Abordagem Descendente]
 */

public class Sintatico {
    private Lexico lexico;
    private Token token;
    private ArrayList<String> listaDeIds;

    public Sintatico(Lexico lexico) {
        this.lexico = lexico;
        this.listaDeIds = new ArrayList<>();
    }

    public void S() {
        this.token = this.lexico.nextToken();

        while (this.token.getTipo() != Token.TIPO_FIM_CODIGO) {
            this.Declaracao();
        }

        if (this.token.getTipo() == Token.TIPO_FIM_CODIGO) {
            System.out.println("Análise sintática concluída: O código está estruturalmente correto.");
        } else {
            throw new RuntimeException("Erro sintático: O final do código não foi alcançado corretamente.");
        }
    }

    private void Declaracao() {
        switch (this.token.getTipo()) {
            case Token.TIPO_PALAVRA_RESERVADA:
                if (this.token.getLexema().equals("int") || this.token.getLexema().equals("float") ||
                        this.token.getLexema().equals("double") || this.token.getLexema().equals("char") ||
                        this.token.getLexema().equalsIgnoreCase("boolean")
                        || this.token.getLexema().equalsIgnoreCase("String")) {
                    this.DeclaracaoVariavel();
                } else if (this.token.getLexema().equals("struct")) {
                    this.DeclaracaoEstrutura();
                } else if (this.token.getLexema().equals("//") || this.token.getLexema().equals("/*")) {
                    this.Comentario();
                } else {
                    throw new RuntimeException(
                            "Erro sintático: Palavra reservada inesperada: " + this.token.getLexema());
                }
                break;
            case Token.TIPO_IDENTIFICADOR:
                this.DeclaracaoFuncao();
                break;
            default:
                throw new RuntimeException("Erro sintático: Tipo de token inesperado: " + this.token.getTipo());
        }

        this.EstruturaControle();
        this.findId(this.token.getLexema());

    }

    private void DeclaracaoVariavel() {
        this.Tipo();
        this.token = this.lexico.nextToken();

        if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um identificador, mas foi encontrado: " + this.token.getLexema());
        }

        this.listaDeVariaveis(this.token.getLexema());
        this.token = this.lexico.nextToken();

        if (this.token.getLexema().equals("=")) {
            this.token = this.lexico.nextToken();
            this.Expressao();
        }

        if (!this.token.getLexema().equals(";")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um ';' para finalizar a declaração de variável, mas foi encontrado: "
                            + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();
    }

    private void DeclaracaoFuncao() {
        this.Tipo();
        this.token = this.lexico.nextToken();

        if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um identificador, mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        if (!this.token.getLexema().equals("(")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um '(', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();
        this.Parametros();

        if (!this.token.getLexema().equals(")")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um ')', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();
        this.Bloco();
    }

    private void Parametros() {
        if (this.token.getTipo() == Token.TIPO_PALAVRA_RESERVADA) {
            this.Parametro();

            while (this.token.getLexema().equals(",")) {
                this.token = this.lexico.nextToken();
                this.Parametro();
            }
        }
    }

    private void Parametro() {
        this.Tipo();
        this.token = this.lexico.nextToken();

        if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um identificador, mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        if (this.token.getLexema().equals("[")) {
            this.token = this.lexico.nextToken();

            if (!this.token.getLexema().equals("]")) {
                throw new RuntimeException(
                        "Erro sintático: Esperava-se um ']', mas foi encontrado: " + this.token.getLexema());
            }

            this.token = this.lexico.nextToken();
        }
    }

    private void Bloco() {
        if (!this.token.getLexema().equals("{")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um '{', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        while (!this.token.getLexema().equals("}")) {
            this.Declaracao();
        }

        this.token = this.lexico.nextToken();
    }

    private void Comentario() {
        if (this.token.getLexema().equals("//")) {
            while (this.token.getTipo() != Token.TIPO_FIM_LINHA) {
                this.token = this.lexico.nextToken();
            }
        } else if (this.token.getLexema().equals("/*")) {
            while (!this.token.getLexema().equals("*/")) {
                this.token = this.lexico.nextToken();
            }
        } else {
            throw new RuntimeException("Erro sintático: Comentário mal formado.");
        }

        this.token = this.lexico.nextToken();
    }

    private void Expressao() {
        this.Atribuicao();
    }

    private void Atribuicao() {
        if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um identificador, mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        if (this.token.getLexema().matches("=|\\+=|-=|\\*=|/=|%=|&&=|\\|\\|=")) {
            this.token = this.lexico.nextToken();
            this.Expressao();
        } else {
            throw new RuntimeException("Erro sintático: Esperava-se um operador de atribuição, mas foi encontrado: "
                    + this.token.getLexema());
        }
    }

    private void DeclaracaoEstrutura() {
        if (!this.token.getLexema().equals("struct")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se 'struct', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se um identificador, mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        if (!this.token.getLexema().equals("{")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se '{', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        while (this.token.getTipo() != Token.TIPO_FIM_CODIGO && !this.token.getLexema().equals("}")) {
            this.DeclaracaoVariavel();
        }

        if (!this.token.getLexema().equals("}")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se '}', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        if (!this.token.getLexema().equals(";")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se ';' após a declaração de estrutura, mas foi encontrado: "
                            + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();
    }

    private void EstruturaControle() {
        switch (this.token.getLexema()) {
            case "if":
                this.token = this.lexico.nextToken();
                if (!this.token.getLexema().equals("(")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se '(', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Expressao();
                if (!this.token.getLexema().equals(")")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ')', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Bloco();
                if (this.token.getLexema().equals("else")) {
                    this.token = this.lexico.nextToken();
                    this.Bloco();
                }
                break;
            case "while":
                this.token = this.lexico.nextToken();
                if (!this.token.getLexema().equals("(")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se '(', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Expressao();
                if (!this.token.getLexema().equals(")")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ')', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Bloco();
                break;
            case "for":
                this.token = this.lexico.nextToken();
                if (!this.token.getLexema().equals("(")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se '(', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Expressao();
                if (!this.token.getLexema().equals(";")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ';', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Expressao();
                if (!this.token.getLexema().equals(";")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ';', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Expressao();
                if (!this.token.getLexema().equals(")")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ')', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Bloco();
                break;
            case "switch":
                this.token = this.lexico.nextToken();
                if (!this.token.getLexema().equals("(")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se '(', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.Expressao();
                if (!this.token.getLexema().equals(")")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ')', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                this.CaseLista();
                break;
            case "break":
                this.token = this.lexico.nextToken();
                if (!this.token.getLexema().equals(";")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ';', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                break;
            case "continue":
                this.token = this.lexico.nextToken();
                if (!this.token.getLexema().equals(";")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ';', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                break;
            case "return":
                this.token = this.lexico.nextToken();
                this.Expressao();
                if (!this.token.getLexema().equals(";")) {
                    throw new RuntimeException(
                            "Erro sintático: Esperava-se ';', mas foi encontrado: " + this.token.getLexema());
                }
                this.token = this.lexico.nextToken();
                break;
            default:
                throw new RuntimeException(
                        "Erro sintático: Estrutura de controle inesperada: " + this.token.getLexema());
        }
    }

    private void CaseLista() {
        if (!this.token.getLexema().equals("{")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se '{', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();

        while (this.token.getLexema().equals("case") || this.token.getLexema().equals("default")) {
            this.CaseDecl();
        }

        if (!this.token.getLexema().equals("}")) {
            throw new RuntimeException(
                    "Erro sintático: Esperava-se '}', mas foi encontrado: " + this.token.getLexema());
        }

        this.token = this.lexico.nextToken();
    }

    private void CaseDecl() {
        if (this.token.getLexema().equals("case")) {
            this.token = this.lexico.nextToken();
            this.Expressao();
            if (!this.token.getLexema().equals(":")) {
                throw new RuntimeException(
                        "Erro sintático: Esperava-se ':', mas foi encontrado: " + this.token.getLexema());
            }
            this.token = this.lexico.nextToken();
            this.Bloco();
        } else if (this.token.getLexema().equals("default")) {
            this.token = this.lexico.nextToken();
            if (!this.token.getLexema().equals(":")) {
                throw new RuntimeException(
                        "Erro sintático: Esperava-se ':', mas foi encontrado: " + this.token.getLexema());
            }
            this.token = this.lexico.nextToken();
            this.Bloco();
        } else {
            throw new RuntimeException("Erro sintático: Declaração de caso mal formada.");
        }
    }

    private void Tipo() {
        if (!(this.token.getLexema().equals("int") || this.token.getLexema().equals("float") ||
                this.token.getLexema().equals("double") || this.token.getLexema().equals("char") ||
                this.token.getLexema().equalsIgnoreCase("boolean")
                || this.token.getLexema().equalsIgnoreCase("String"))) {
            throw new RuntimeException("Erro sintático: Tipo de dado inválido: " + this.token.getLexema());
        }
    }

    private void listaDeVariaveis(String id) {
        for (String varId : this.listaDeIds) {
            if (id.equals(varId)) {
                throw new RuntimeException("Erro sintático: Variável duplicada: " + id);
            }
        }
        this.listaDeIds.add(id);
    }

    private void findId(String id) {
        if (!this.listaDeIds.contains(id)) {
            throw new RuntimeException("Erro sintático: Variável não declarada: " + id);
        }
    }
}