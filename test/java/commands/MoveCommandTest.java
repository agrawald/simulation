package commands;

import common.Coordinates;
import common.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class MoveCommandTest extends CommandTest {

    @Before
    public void setUp() {
        super.setup();
        command = new MoveCommand(robot, board);
    }

    @Test
    public void shouldExecuteCommand() {
        Coordinates oldCoordinates = robot.getCoordinates();
        Assert.assertTrue(command.execute("move"));
        Assert.assertEquals(oldCoordinates.getX(), robot.getCoordinates().getX());
        Assert.assertEquals(oldCoordinates.getY() + 1, robot.getCoordinates().getY());

        oldCoordinates = robot.getCoordinates();
        robot.setDirection(Direction.EAST);
        Assert.assertTrue(command.execute("move"));
        Assert.assertEquals(oldCoordinates.getX() + 1, robot.getCoordinates().getX());
        Assert.assertEquals(oldCoordinates.getY(), robot.getCoordinates().getY());

        oldCoordinates = robot.getCoordinates();
        robot.setDirection(Direction.SOUTH);
        Assert.assertTrue(command.execute("move"));
        Assert.assertEquals(oldCoordinates.getX(), robot.getCoordinates().getX());
        Assert.assertEquals(oldCoordinates.getY() - 1, robot.getCoordinates().getY());

        oldCoordinates = robot.getCoordinates();
        robot.setDirection(Direction.WEST);
        Assert.assertTrue(command.execute("move"));
        Assert.assertEquals(oldCoordinates.getX() - 1, robot.getCoordinates().getX());
        Assert.assertEquals(oldCoordinates.getY(), robot.getCoordinates().getY());


    }

    @Test
    public void shouldNotExecuteCommand() {
        robot.setCoordinates(new Coordinates(-1, -1));
        Assert.assertFalse(command.execute("move"));

        robot.setCoordinates(new Coordinates(0, 4));
        Assert.assertFalse(command.execute("move"));

    }
}
