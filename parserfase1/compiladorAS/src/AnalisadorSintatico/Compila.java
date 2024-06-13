package src.AnalisadorSintatico;

/*
 * Ricardo André & Gustavo Melo
 * Unicap Icam-Tech
 * 20/05/2024
 */
public class Compila {

    public static void main(String[] args) {

        Lexico lexico = new Lexico(
                "C:\\Users\\ricar\\OneDrive\\Área de Trabalho\\parser\\compiladorAS\\src\\codigo.txt");

        // Lexico lexico2 = new Lexico("C:\\Users\\ricar\\OneDrive\\Área de
        // Trabalho\\parser\\compiladorAS\\src\\codigo2.txt");

        // Lexico lexico3 = new Lexico("C:\\Users\\ricar\\OneDrive\\Área de
        // Trabalho\\parser\\compiladorAS\\src\\codigo3.txt");

        Token token;
        while ((token = lexico.nextToken()) != null) {
            System.out.println(token);
            if (token.getTipo() == Token.TIPO_FIM_CODIGO) {
                break;
            }
        }

    }

}