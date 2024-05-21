# Analisador Léxico & Sintático Java

Este projeto é um exemplo simples de um analisador léxico e sintático implementado em Java para uma linguagem de programação específica. O analisador léxico divide o código-fonte em tokens, enquanto o analisador sintático verifica se a sequência de tokens segue a gramática da linguagem.

## Descrição do Analisador Léxico

O analisador léxico é responsável por ler o código-fonte e convertê-lo em uma sequência de tokens. Cada token representa uma unidade léxica da linguagem, como palavras-chave, identificadores, operadores, literais e caracteres especiais.

### Exemplo de Código-Fonte

Considere o seguinte exemplo de código-fonte:

```java
class Main {
    int x = 10;
    float y = 20.5;
    char z = 'a';
    if (x < y) {
        x = x + 1;
    }
}
```

Tokens Gerados
O analisador léxico dividirá este código em tokens, tais como:

- PALAVRA_RESERVADA: class
- IDENTIFICADOR: Main
- CARACTER_ESPECIAL: {
- PALAVRA_RESERVADA: int
- IDENTIFICADOR: x
- OPERADOR_ATRIBUICAO: =
- INTEIRO: 10
- PALAVRA_RESERVADA: float
- IDENTIFICADOR: y
- OPERADOR_ATRIBUICAO: =
- REAL: 20.5
- PALAVRA_RESERVADA: char
- IDENTIFICADOR: z
- OPERADOR_ATRIBUICAO: =
- CHAR: 'a'
- PALAVRA_RESERVADA: if
- CARACTER_ESPECIAL: (
- IDENTIFICADOR: x
- OPERADOR_RELACIONAL: <
- IDENTIFICADOR: y
- CARACTER_ESPECIAL: )
- CARACTER_ESPECIAL: {
- IDENTIFICADOR: x
- OPERADOR_ATRIBUICAO: =
- IDENTIFICADOR: x
- OPERADOR_ARITMETICO: +
- INTEIRO: 1
- CARACTER_ESPECIAL: }
- CARACTER_ESPECIAL: }

## Descrição do Analisador Sintático
O analisador sintático recebe a sequência de tokens do analisador léxico e verifica se esta sequência está de acordo com as regras gramaticais da linguagem. Ele constrói uma árvore de análise (parse tree) que representa a estrutura sintática do código.

## Estrutura da Gramática
A gramática da linguagem pode incluir regras como:

- Uma declaração de classe deve começar com a palavra-chave class, seguida por um identificador e um bloco de código delimitado por { e }.
- Uma declaração de variável deve incluir um tipo (por exemplo, int, float, char), seguido por um identificador, um operador de atribuição =, e um valor literal.
- Uma estrutura condicional if deve incluir a palavra-chave if, seguida por uma expressão entre parênteses ( e ), e um bloco de código delimitado por { e }.
  
## Estrutura do Projeto

- *Lexico.java*: Implementa o analisador léxico que lê o arquivo de código-fonte e gera os tokens.
- *Sintatico.java*: Implementa o analisador sintático que verifica a estrutura gramatical do código com base nos tokens gerados pelo analisador léxico.
- *Token.java*: Define a classe Token para representar os diferentes tipos de tokens.
- *Main.java*: O ponto de entrada do programa.

## Licença
Este projeto está licenciado sob a **MIT License**.
