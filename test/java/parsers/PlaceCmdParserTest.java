package parsers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class PlaceCmdParserTest {

    private CmdParser parser;

    @Before
    public void setup() {
        parser = new PlaceCmdParser();
    }

    @Test
    public void shouldParse() {
        Assert.assertTrue(parser.parse("place 1,1,north"));
        Assert.assertEquals(parser.getGroups().length, 4);
        Assert.assertEquals(parser.getGroups()[0], "place 1,1,north");
        Assert.assertEquals(parser.getGroups()[1], "1");
        Assert.assertEquals(parser.getGroups()[2], "1");
        Assert.assertEquals(parser.getGroups()[3], "north");

        Assert.assertTrue(parser.parse("PLACE 1,1,NORTH"));
        Assert.assertEquals(parser.getGroups().length, 4);
        Assert.assertEquals(parser.getGroups()[0], "PLACE 1,1,NORTH");
        Assert.assertEquals(parser.getGroups()[1], "1");
        Assert.assertEquals(parser.getGroups()[2], "1");
        Assert.assertEquals(parser.getGroups()[3], "NORTH");

        Assert.assertTrue(parser.parse("PLACE 1, 1 ,NORTH"));
        Assert.assertEquals(parser.getGroups().length, 4);
        Assert.assertEquals(parser.getGroups()[0], "PLACE 1, 1 ,NORTH");
        Assert.assertEquals(parser.getGroups()[1], "1");
        Assert.assertEquals(parser.getGroups()[2], "1");
        Assert.assertEquals(parser.getGroups()[3], "NORTH");

    }

    @Test
    public void shouldNotParse() {
        Assert.assertFalse(parser.parse("place 1"));
        Assert.assertFalse(parser.parse("PLACE 0,1"));
        Assert.assertFalse(parser.parse("place 1 1,WEST"));
        Assert.assertFalse(parser.parse("place 3 1 South"));
        Assert.assertFalse(parser.parse("place EaSt"));
    }
}
