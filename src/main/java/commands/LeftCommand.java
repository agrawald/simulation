package commands;

import boards.Board;
import common.Direction;
import parsers.LeftCmdParser;
import robots.Robot;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class to represent a left command
 */
public class LeftCommand extends Command {
    /**
     * Constructor to initialize the Left command
     *
     * @param robot
     * @param board
     */
    public LeftCommand(Robot robot, Board board) {
        super(new LeftCmdParser(), robot, board);
    }

    @Override
    public boolean execute(String cmd) {
        //If the command is valid and the robot is inside the board
        if (cmdParser.parse(cmd) && board.isOnBoard(robot.getCoordinates())) {
            //Change the direction
            Direction direction = robot.getDirection();
            robot.setDirection(Direction.toDirection(direction.getAngle() + 90));
            return true;
        }

        return false;
    }
}
