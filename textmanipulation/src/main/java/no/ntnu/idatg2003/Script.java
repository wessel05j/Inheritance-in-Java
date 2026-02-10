
package no.ntnu.idatg2003;

import java.util.ArrayList;
import java.util.List;

/**
 * Command to execute a sequence of text commands.
 */
public class Script implements TextCommand {
    private final List<TextCommand> commands;

    /**
     * Create an empty script.
     */
    public Script() {
        this.commands = new ArrayList<>();
    }

    /**
     * Add a command to the script.
     * 
     * @param command The command to add.
     */
    public void addCommand(TextCommand command) {
        commands.add(command);
    }

    /**
     * Executes all commands in sequence on the input text.
     * 
     * @param text The input text.
     * @return The text after all commands have been executed.
     */
    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        String result = text;
        for (TextCommand command : commands) {
            result = command.execute(result);
        }
        return result;
    }
}
