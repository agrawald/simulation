package robots;

import common.Coordinates;
import common.Direction;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Generic interface to expose generic functionality fo a robot
 */
public interface Robot {
    /**
     * Gets the coordinates
     *
     * @return the coordinates
     */
    Coordinates getCoordinates();

    /**
     * Sets the coordinate for the robot
     *
     * @param coordinates the coordinates
     */
    void setCoordinates(Coordinates coordinates);

    /**
     * Gets the direction of the robot
     *
     * @return the direction
     */
    Direction getDirection();

    /**
     * Sets the direction of the robot
     *
     * @param direction the direction
     */
    void setDirection(Direction direction);
}
