package robots;

import common.Coordinates;
import common.Direction;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * The class SimpleRobot represent an instance of the toy robot.
 * It has the location coordinates and the direction in which the robot is facing
 */
public class SimpleRobot implements Robot {
    /**
     * The coordinate on the board the robot is placed
     */
    private Coordinates coordinates;

    /**
     * The direction in which robot is facing on the board
     */
    private Direction direction;

    /**
     * Default constructor
     */
    public SimpleRobot() {
    }

    /**
     * Constructor
     *
     * @param coordinates the coordinates
     * @param direction   the direction
     */
    public SimpleRobot(Coordinates coordinates, Direction direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    @Override
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
