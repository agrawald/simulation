package common;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * The enum class Direction is used to define the direction in which the robot can move.
 * In future we can enhance it to add move directions to move in.
 * Each direction would have an angel in degrees, as it will make our calculation easier.
 */
public enum Direction {
    EAST(0), WEST(180), NORTH(90), SOUTH(270);

    /**
     * Angle in degrees
     */
    private int angle;

    /**
     * Constructor to initialize the Direction with an angle
     *
     * @param angle
     */
    Direction(int angle) {
        this.angle = angle;
    }

    /**
     * Method to convert the angle into direction enum
     *
     * @param angle in degrees
     * @return Direction enum
     */
    public static Direction toDirection(int angle) {
        if (angle < 0) angle += 360;
        if (angle >= 360) angle -= 360;
        return (angle == NORTH.getAngle() ? NORTH :
                angle == EAST.getAngle() ? EAST :
                        angle == WEST.getAngle() ? WEST : SOUTH);
    }

    /**
     * Method to get the angle of the direction
     *
     * @return int value of the angle in degrees
     */
    public int getAngle() {
        return this.angle;
    }
}
