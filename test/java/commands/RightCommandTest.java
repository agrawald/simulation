package commands;

import common.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class RightCommandTest extends CommandTest {

    @Before
    public void setUp() {
        super.setup();
        command = new RightCommand(robot, board);
    }

    @Test
    public void shouldExecuteCommand() {
        Assert.assertTrue(command.execute("right"));
        Assert.assertEquals(Direction.EAST, robot.getDirection());
    }

    @Test
    public void shouldNotExecuteCommand() {
        Assert.assertFalse(command.execute("lft"));
        Assert.assertEquals(Direction.NORTH, robot.getDirection());
    }
}
