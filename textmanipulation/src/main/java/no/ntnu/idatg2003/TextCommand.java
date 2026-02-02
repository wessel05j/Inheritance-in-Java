
package no.ntnu.idatg2003;

/**
 * Interface for text manipulation commands.
 */
public interface TextCommand {
    /**
     * Executes the command on the input text.
     * 
     * @param text The input text.
     */
    String execute(String text);
}
