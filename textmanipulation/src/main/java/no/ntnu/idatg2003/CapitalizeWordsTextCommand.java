package no.ntnu.idatg2003;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
    @Override
    public String execute(String text) {
        String[] words = text.split(" ");
        StringBuilder capitalizedText = new StringBuilder();

        for (String word : words) {
            String capitalizedWord = super.execute(word);
            capitalizedText.append(capitalizedWord).append(" ");
        }

        return capitalizedText.toString().trim();
    }

}
