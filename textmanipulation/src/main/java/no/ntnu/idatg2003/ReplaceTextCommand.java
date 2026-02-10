
package no.ntnu.idatg2003;

/**
 * Command to replace all occurrences of a target string.
 */
public class ReplaceTextCommand implements TextCommand {
    protected final String target;
    protected final String replacement;

    /**
     * Create command for replacing all occurrences.
     * 
     * @param target      The target string to be replaced.
     * @param replacement The replacement string.
     */
    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    /**
     * Replaces all occurrences of the target in the input text.
     * 
     * @param text The input text.
     * @return The text with all occurrences of the target replaced.
     */
    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty() || target.isEmpty()) {
            return text;
        }
        return text.replace(target, replacement);
    }
}
