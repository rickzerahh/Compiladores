package parser;

import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        try {
            String fileName = "C:\\Users\\ricar\\OneDrive\\Área de Trabalho\\parsercompiler\\demo\\src\\main\\java\\parser\\codigo.txt";

            LanguageLexer lexer = new LanguageLexer(CharStreams.fromFileName(fileName));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LanguageParser parser = new LanguageParser(tokens);
            LanguageBaseListener listener = new MyLanguageListener();
            parser.addParseListener(listener);
            parser.start();

            System.out.println("Parsing foi efetuado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro durante parsing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
