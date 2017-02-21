package commands;

import common.Coordinates;
import common.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class PlaceCommandTest extends CommandTest {

    @Before
    public void setUp() {
        super.setup();
        command = new PlaceCommand(robot, board);
    }

    @Test
    public void shouldExecuteCommand() {
        Assert.assertTrue(command.execute("place 1,0,north"));
        Assert.assertEquals(robot.getDirection(), Direction.NORTH);
        Assert.assertEquals(robot.getCoordinates(), new Coordinates(1, 0));

        Assert.assertTrue(command.execute("PLACE 0,1,east"));
        Assert.assertEquals(robot.getDirection(), Direction.EAST);
        Assert.assertEquals(robot.getCoordinates(), new Coordinates(0, 1));

        Assert.assertTrue(command.execute("place 1,1,WEST"));
        Assert.assertEquals(robot.getDirection(), Direction.WEST);
        Assert.assertEquals(robot.getCoordinates(), new Coordinates(1, 1));

        Assert.assertTrue(command.execute("place 3, 1, South"));
        Assert.assertEquals(robot.getDirection(), Direction.SOUTH);
        Assert.assertEquals(robot.getCoordinates(), new Coordinates(3, 1));

        Assert.assertTrue(command.execute("place 4 ,1 ,EaSt"));
        Assert.assertEquals(robot.getDirection(), Direction.EAST);
        Assert.assertEquals(robot.getCoordinates(), new Coordinates(4, 1));
    }

    @Test
    public void shouldNotExecuteCommand() {
        Assert.assertFalse(command.execute("place 1"));
        Assert.assertFalse(command.execute("PLACE 0,1"));
        Assert.assertFalse(command.execute("place 1 1,WEST"));
        Assert.assertFalse(command.execute("place 3 1 South"));
        Assert.assertFalse(command.execute("place EaSt"));
        Assert.assertEquals(robot.getDirection(), Direction.NORTH);
        Assert.assertEquals(robot.getCoordinates(), new Coordinates(0, 0));

        Assert.assertFalse(command.execute("place 5,5,north"));
        Assert.assertEquals(robot.getDirection(), Direction.NORTH);
        Assert.assertEquals(robot.getCoordinates(), new Coordinates(0, 0));
    }
}
