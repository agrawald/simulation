package parsers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class ReportCmdParserTest {

    private CmdParser parser;

    @Before
    public void setup() {
        parser = new ReportCmdParser();
    }

    @Test
    public void shouldParse() {
        Assert.assertTrue(parser.parse("report"));
        Assert.assertTrue(parser.parse("REPORT"));
    }

    @Test
    public void shouldNotParse() {
        Assert.assertFalse(parser.parse("rght"));
    }
}
