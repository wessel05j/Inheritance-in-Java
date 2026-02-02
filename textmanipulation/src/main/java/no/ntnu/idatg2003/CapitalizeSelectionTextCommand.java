package no.ntnu.idatg2003;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private final String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        String capitalizedSelection = super.execute(selection);
        return text.replace(selection, capitalizedSelection);
    }

}
