
package no.ntnu.idatg2003;

/**
 * Command to wrap a selected part of the text.
 */
public class WrapSelectionTextCommand extends WrapTextCommand {
    protected String selection;

    /**
     * Create command for wrapping a selection.
     * 
     * @param opening   The string to add at the beginning of the selection.
     * @param end       The string to add at the end of the selection.
     * @param selection The selected text to wrap.
     */
    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    /**
     * Wraps the selected text in the input.
     * 
     * @param text The input text.
     * @return the selected text wrapped.
     */
    @Override
    public String execute(String text) {
        return text.replace(selection, opening + selection + end);
    }

}
