package boards;

import common.Coordinates;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class SimpleBoard: The class represent the entity board of rows X columns.
 * The board can have a robot which can be placed anywhere in the board.
 */
public class SimpleBoard implements Board {

    /**
     * The variable for holding the number of rows in a board
     */
    private int rows;

    /**
     * The variable for holding the number of columns in a board
     */
    private int cols;

    /**
     * Constructor to create a SimpleBoard object
     *
     * @param rows number of max rows on the board
     * @param cols number of max columns on the board
     */
    public SimpleBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public boolean isOnBoard(Coordinates coordinates) {
        if (coordinates == null) return false;
        return coordinates.getX() >= 0 && rows > coordinates.getX()
                && coordinates.getY() >= 0 && cols > coordinates.getY();
    }
}
