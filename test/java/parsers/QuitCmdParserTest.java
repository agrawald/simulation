package parsers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class QuitCmdParserTest {

    private CmdParser parser;

    @Before
    public void setup() {
        parser = new QuitCmdParser();
    }

    @Test
    public void shouldParse() {
        Assert.assertTrue(parser.parse("quit"));
        Assert.assertTrue(parser.parse("QUIT"));
    }

    @Test
    public void shouldNotParse() {
        Assert.assertFalse(parser.parse("rght"));
    }
}
