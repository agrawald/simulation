package commands;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class ReportCommandTest extends CommandTest {

    @Before
    public void setUp() {
        super.setup();
        command = new ReportCommand(robot, board);
    }

    @Test
    public void shouldExecuteCommand() {
        Assert.assertTrue(command.execute("report"));
    }

    @Test
    public void shouldNotExecuteCommand() {
        Assert.assertFalse(command.execute("mv"));
    }
}
