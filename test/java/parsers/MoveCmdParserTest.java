package parsers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class MoveCmdParserTest {

    private CmdParser parser;

    @Before
    public void setup() {
        parser = new MoveCmdParser();
    }

    @Test
    public void shouldParse() {
        Assert.assertTrue(parser.parse("move"));
        Assert.assertEquals(parser.getGroups().length, 1);
        Assert.assertEquals(parser.getGroups()[0], "move");

        Assert.assertTrue(parser.parse("MOVE"));
        Assert.assertEquals(parser.getGroups().length, 1);
        Assert.assertEquals(parser.getGroups()[0], "MOVE");

    }

    @Test
    public void shouldNotParse() {
        Assert.assertFalse(parser.parse("mv"));
    }
}
