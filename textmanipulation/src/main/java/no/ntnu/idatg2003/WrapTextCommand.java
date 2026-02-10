
package no.ntnu.idatg2003;

/**
 * Command to wrap text with specified strings.
 */
public class WrapTextCommand implements TextCommand {
    protected String opening;
    protected String end;

    /**
     * Create command for wrapping text.
     * 
     * @param opening The string to add at the beginning.
     * @param end     The string to add at the end.
     */
    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    /**
     * Wraps the input text.
     * 
     * @param text The input text.
     * @return The wrapped text.
     */
    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return opening + text + end;
    }
}
