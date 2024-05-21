# Analisador Léxico Java

Este é um programa simples em Java que implementa um analisador léxico para uma linguagem de programação específica. Um analisador léxico é responsável por dividir o código fonte em uma sequência de tokens, que são os componentes básicos da linguagem.

## Como Funciona

O programa lê um arquivo de código-fonte escrito em uma linguagem específica e identifica cada token presente no código. Os tokens podem incluir palavras-chave, identificadores, números, operadores, caracteres especiais, etc.

## Uso

1. Compile o programa Java utilizando o comando `javac`:

    ```
    javac Lexico.java Sintatico.java Token.java Main.java
    ```

2. Execute o programa passando o caminho para o arquivo de código-fonte como argumento:

    ```
    java Main caminho_para_arquivo
    ```

3. O programa analisará o arquivo de código-fonte e exibirá os tokens identificados no console.

## Estrutura do Código

- `Lexico.java`: Implementa o analisador léxico que lê o arquivo de código-fonte e gera os tokens.
- `Sintatico.java`: Implementa o analisador sintático que verifica a estrutura gramatical do código com base nos tokens gerados pelo analisador léxico.
- `Token.java`: Define a classe Token para representar os diferentes tipos de tokens.
- `Main.java`: O ponto de entrada do programa.

## Exemplo

Suponha que temos um arquivo `codigo.txt` com o seguinte conteúdo:

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

O programa analisará este arquivo e produzirá os seguintes TOKENS:

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
- CARACTER_ESPECIAL: ;
- CARACTER_ESPECIAL: }

### Licença
Este projeto está licenciado sob a **MIT License**.
