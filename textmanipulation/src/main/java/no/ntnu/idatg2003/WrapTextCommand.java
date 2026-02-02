package no.ntnu.idatg2003;

public class WrapTextCommand implements TextCommand {
    protected String opening;
    protected String end;

    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    @Override
    public String execute(String text) {
        return opening + text + end;
    }
}
