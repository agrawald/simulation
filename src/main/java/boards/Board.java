package boards;

import common.Coordinates;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Interface to represent a Board, implemented by SimpleBoard
 */
public interface Board {
    /**
     * Method to check if the coordinates are within the board
     *
     * @param coordinates the coordinates
     * @return true if inside the board, false otherwise
     */
    boolean isOnBoard(Coordinates coordinates);
}
