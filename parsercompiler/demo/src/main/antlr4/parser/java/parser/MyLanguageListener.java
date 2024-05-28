package parser;

public class MyLanguageListener extends LanguageBaseListener {
    @Override
    public void enterStart(LanguageParser.StartContext ctx) {
        // Implemente a lógica para processar a entrada da regra 'start' aqui
        System.out.println("Entrou na regra 'start'");
    }

    @Override
    public void exitStart(LanguageParser.StartContext ctx) {
        // Implemente a lógica para processar a saída da regra 'start' aqui
        System.out.println("Saiu da regra 'start'");
    }
}