package commands;

import common.Coordinates;
import common.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class LeftCommandTest extends CommandTest {

    @Before
    public void setUp() {
        super.setup();
        command = new LeftCommand(robot, board);
    }

    @Test
    public void shouldExecuteCommand() {
        Assert.assertTrue(command.execute("left"));
        Assert.assertEquals(Direction.WEST, robot.getDirection());
    }

    @Test
    public void shouldNotExecuteCommand() {
        robot.setCoordinates(new Coordinates(-1, -1));
        Assert.assertFalse(command.execute("left"));
        Assert.assertEquals(Direction.NORTH, robot.getDirection());
    }
}
