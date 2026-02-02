package no.ntnu.idatg2003;

public class WrapLinesTextCommand extends WrapTextCommand {

    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text) {
        String[] lines = text.split("\n");

        for (int i = 0; i < lines.length; i++) {
            lines[i] = opening + lines[i] + end;
        }
        return String.join("\n", lines);
    }

}
