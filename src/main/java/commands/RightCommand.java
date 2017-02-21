package commands;

import boards.Board;
import common.Direction;
import parsers.RightCmdParser;
import robots.Robot;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class to represent the right command
 */
public class RightCommand extends Command {
    /**
     * Constructor
     * @param robot the robot instance
     * @param board the board instance
     */
    public RightCommand(Robot robot, Board board) {
        super(new RightCmdParser(), robot, board);
    }

    @Override
    public boolean execute(String cmd) {
        //If the command is valid and robot is inside the board
        if(cmdParser.parse(cmd) && board.isOnBoard(robot.getCoordinates())){
            //Change the direction
            Direction direction = robot.getDirection();
            robot.setDirection(Direction.toDirection(direction.getAngle() - 90));
            return true;
        }

        return false;
    }
}
