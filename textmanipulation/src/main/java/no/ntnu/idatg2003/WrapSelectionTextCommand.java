package no.ntnu.idatg2003;

public class WrapSelectionTextCommand extends WrapTextCommand {
    protected String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        return text.replace(selection, opening + selection + end);
    }

}
