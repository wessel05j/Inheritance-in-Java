
package no.ntnu.idatg2003;

/**
 * Command to replace the first occurrence of a target string.
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    /**
     * Create command for replacing the first occurrence.
     * 
     * @param target      The target string to be replaced.
     * @param replacement The replacement string.
     */
    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    /**
     * Replaces the first occurrence of the target in the input text.
     * 
     * @param text The input text.
     * @return The text with the first occurrence of the target replaced.
     */
    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty() || target.isEmpty()) {
            return text;
        }
        return text.replaceFirst(target, replacement);
    }
}
