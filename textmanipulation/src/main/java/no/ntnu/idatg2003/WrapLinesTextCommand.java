
package no.ntnu.idatg2003;

/**
 * Command to wrap each line of text with specified strings.
 */
public class WrapLinesTextCommand extends WrapTextCommand {

    /**
     * Create command for wrapping lines.
     * 
     * @param opening The string to add at the beginning of each line.
     * @param end     The string to add at the end of each line.
     */
    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    /**
     * Wraps each line in the input text.
     * 
     * @param text The input text.
     * @return The text with each line wrapped.
     */
    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        String[] lines = text.split("\n");

        for (int i = 0; i < lines.length; i++) {
            lines[i] = opening + lines[i] + end;
        }
        return String.join("\n", lines);
    }

}
