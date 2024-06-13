package main;

import antlr.FCpLexer;
import antlr.FCpParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName("C:\\Users\\ricar\\OneDrive\\Área de Trabalho\\compiler-master\\inputFiles\\teste2.txt");
        FCpLexer fcpLexer = new FCpLexer(cs);
        Token tk = null;
        CommonTokenStream tokenList = new CommonTokenStream(fcpLexer);
        tokenList.fill();
        FCpParser fCpParser = new FCpParser(tokenList);
        FCpParser.StartContext tree = fCpParser.start();
        FCpSemantic  FCpsemantic  = new FCpSemantic();
        FCpsemantic.visitStart(tree);
        SemanticUtils.semanticErrors.forEach((err) -> System.out.println(err));
        FCpsemantic.table.printTable();
        if(SemanticUtils.semanticErrors.isEmpty()){
            CppGenerator cppG = new CppGenerator();
            cppG.visitStart(tree);
            try(PrintWriter pw = new PrintWriter("C:\\Users\\ricar\\OneDrive\\Área de Trabalho\\compiler-master\\outputFile\\saida2.cpp")){
                pw.print(cppG.outputStr.toString());
            }
        }
    }
}