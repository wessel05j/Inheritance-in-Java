package no.ntnu.idatg2003;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testReplaceTextCommand() {
        ReplaceTextCommand cmd = new ReplaceTextCommand("cat", "dog");
        assertEquals("The dog sat on the mat.", cmd.execute("The cat sat on the mat."));
    }

    @Test
    public void testReplaceFirstTextCommand() {
        ReplaceFirstTextCommand cmd = new ReplaceFirstTextCommand("cat", "dog");
        assertEquals("dog cat cat", cmd.execute("cat cat cat"));
    }

    @Test
    public void testWrapTextCommand() {
        WrapTextCommand cmd = new WrapTextCommand("<b>", "</b>");
        assertEquals("<b>hello</b>", cmd.execute("hello"));
    }

    @Test
    public void testWrapLinesTextCommand() {
        WrapLinesTextCommand cmd = new WrapLinesTextCommand("<li>", "</li>");
        String input = "a\nb\nc";
        String expected = "<li>a</li>\n<li>b</li>\n<li>c</li>";
        assertEquals(expected, cmd.execute(input));
    }
}
