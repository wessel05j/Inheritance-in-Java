
package no.ntnu.idatg2003;

/**
 * Command to capitalize a selected part of the text.
 */
public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private final String selection;

    /**
     * Create command for capitalizing a selection.
     * 
     * @param selection The selected text to capitalize.
     * @return The capitalized selection.
     */
    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }

    /**
     * Capitalizes the selected text in the input.
     * 
     * @param text The input text.
     * @return The text with the selected part capitalized.
     */
    @Override
    public String execute(String text) {
        String capitalizedSelection = super.execute(selection);
        return text.replace(selection, capitalizedSelection);
    }

}
