
package no.ntnu.idatg2003;

/**
 * Command to capitalize the first character of every word in the text.
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
    /**
     * Capitalizes the first character of each word in the input text.
     * 
     * @param text The input text.
     * @return The text with the first character of each word capitalized.
     */
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
