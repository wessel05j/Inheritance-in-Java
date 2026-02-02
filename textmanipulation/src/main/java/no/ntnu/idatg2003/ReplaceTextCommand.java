package no.ntnu.idatg2003;

public class ReplaceTextCommand implements TextCommand {
    private final String target;
    private final String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    @Override
    public String execute(String text) {
        return text.replace(target, replacement);
    }
}
