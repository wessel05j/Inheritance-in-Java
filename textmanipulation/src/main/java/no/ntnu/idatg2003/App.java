package no.ntnu.idatg2003;

public class App {
    public static void main(String[] args) {
        String text = "the quick brown fox\njumps over the lazy dog";

        // ReplaceTextCommand
        ReplaceTextCommand replaceCmd = new ReplaceTextCommand("fox", "cat");
        System.out.println("ReplaceTextCommand: " + replaceCmd.execute(text));

        // ReplaceFirstTextCommand
        ReplaceFirstTextCommand replaceFirstCmd = new ReplaceFirstTextCommand("the", "a");
        System.out.println("ReplaceFirstTextCommand: " + replaceFirstCmd.execute(text));

        // WrapTextCommand
        WrapTextCommand wrapCmd = new WrapTextCommand("<b>", "</b>");
        System.out.println("WrapTextCommand: " + wrapCmd.execute(text));

        // WrapLinesTextCommand
        WrapLinesTextCommand wrapLinesCmd = new WrapLinesTextCommand("<li>", "</li>");
        System.out.println("WrapLinesTextCommand: " + wrapLinesCmd.execute(text));

        // WrapSelectionTextCommand
        WrapSelectionTextCommand wrapSelectionCmd = new WrapSelectionTextCommand("[", "]", "quick");
        System.out.println("WrapSelectionTextCommand: " + wrapSelectionCmd.execute(text));

        // CapitalizeTextCommand
        CapitalizeTextCommand capitalizeCmd = new CapitalizeTextCommand();
        System.out.println("CapitalizeTextCommand: " + capitalizeCmd.execute(text));

        // CapitalizeWordsTextCommand
        CapitalizeWordsTextCommand capitalizeWordsCmd = new CapitalizeWordsTextCommand();
        System.out.println("CapitalizeWordsTextCommand: " + capitalizeWordsCmd.execute(text));

        // Script: combine commands
        Script script = new Script();
        script.addCommand(new ReplaceTextCommand("dog", "cat"));
        script.addCommand(new CapitalizeWordsTextCommand());
        script.addCommand(new WrapLinesTextCommand("<li>", "</li>"));
        System.out.println("Script (Replace, CapitalizeWords, WrapLines): " + script.execute(text));
    }
}
