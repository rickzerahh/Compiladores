package parser;

public class MyLanguageListener extends LanguageBaseListener {
    @Override
    public void enterStart(LanguageParser.StartContext ctx) {
        System.out.println("Entrou na regra 'start'");
    }

    @Override
    public void exitStart(LanguageParser.StartContext ctx) {
        System.out.println("Saiu da regra 'start'");
    }
}
