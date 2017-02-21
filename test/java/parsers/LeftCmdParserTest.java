package parsers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class LeftCmdParserTest {

    private CmdParser parser;

    @Before
    public void setup() {
        parser = new LeftCmdParser();
    }

    @Test
    public void shouldParse() {
        Assert.assertTrue(parser.parse("left"));
        Assert.assertEquals(parser.getGroups().length, 1);
        Assert.assertEquals(parser.getGroups()[0], "left");

        Assert.assertTrue(parser.parse("LEFT"));
        Assert.assertEquals(parser.getGroups().length, 1);
        Assert.assertEquals(parser.getGroups()[0], "LEFT");

    }

    @Test
    public void shouldNotParse() {
        Assert.assertFalse(parser.parse("lft"));
    }
}
