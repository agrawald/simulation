package boards;

import common.Coordinates;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public class SimpleBoardTest {

    private Board board;

    @Before
    public void setup() {
        board = new SimpleBoard(5, 5);
    }

    @Test
    public void shouldCheckCoordinatesOnBoard() {
        Assert.assertTrue(board.isOnBoard(new Coordinates(1, 1)));
    }

    @Test
    public void shouldCheckCoordinatesOutOfBoard() {
        Assert.assertFalse(board.isOnBoard(new Coordinates(5, 5)));
    }
}
