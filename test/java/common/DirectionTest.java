package common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class DirectionTest {
    @Test
    public void shouldConvertAngleToDirection() {
        Assert.assertEquals(Direction.EAST, Direction.toDirection(0));
        Assert.assertEquals(Direction.NORTH, Direction.toDirection(90));
        Assert.assertEquals(Direction.WEST, Direction.toDirection(180));
        Assert.assertEquals(Direction.SOUTH, Direction.toDirection(270));
        Assert.assertEquals(Direction.EAST, Direction.toDirection(360));
        Assert.assertEquals(Direction.SOUTH, Direction.toDirection(-90));
        Assert.assertEquals(Direction.WEST, Direction.toDirection(-180));
        Assert.assertEquals(Direction.NORTH, Direction.toDirection(-270));
        Assert.assertEquals(Direction.EAST, Direction.toDirection(-360));
        Assert.assertEquals(Direction.SOUTH, Direction.toDirection(-450));
        Assert.assertEquals(Direction.NORTH, Direction.toDirection(450));
    }
}