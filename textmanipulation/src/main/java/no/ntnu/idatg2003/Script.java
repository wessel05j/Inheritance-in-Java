package no.ntnu.idatg2003;

import java.util.ArrayList;
import java.util.List;

public class Script implements TextCommand {
    private final List<TextCommand> commands;

    public Script() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(TextCommand command) {
        commands.add(command);
    }

    @Override
    public String execute(String text) {
        String result = text;
        for (TextCommand command : commands) {
            result = command.execute(result);
        }
        return result;
    }
}