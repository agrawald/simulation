package parsers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class RightCmdParserTest {

    private CmdParser parser;

    @Before
    public void setup() {
        parser = new RightCmdParser();
    }

    @Test
    public void shouldParse() {
        Assert.assertTrue(parser.parse("right"));
        Assert.assertEquals(parser.getGroups().length, 1);
        Assert.assertEquals(parser.getGroups()[0], "right");

        Assert.assertTrue(parser.parse("RIGHT"));
        Assert.assertEquals(parser.getGroups().length, 1);
        Assert.assertEquals(parser.getGroups()[0], "RIGHT");

    }

    @Test
    public void shouldNotParse() {
        Assert.assertFalse(parser.parse("rght"));
    }
}
