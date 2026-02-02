
package no.ntnu.idatg2003;

/**
 * Command to capitalize the first character of the text.
 */
public class CapitalizeTextCommand implements TextCommand {
    /**
     * Capitalizes the first character of the input text.
     * 
     * @param text The input text.
     * @return The text with the first character capitalized.
     */
    @Override
    public String execute(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
