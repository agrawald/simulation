package commands;

import boards.Board;
import common.Coordinates;
import common.Direction;
import parsers.ReportCmdParser;
import robots.Robot;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class to represent a report command
 */
public class ReportCommand extends Command {
    /**
     * Constructor
     *
     * @param robot the robot instance
     * @param board the board instance
     */
    public ReportCommand(Robot robot, Board board) {
        super(new ReportCmdParser(), robot, board);
    }

    @Override
    public boolean execute(String cmd) {
        //if the command is valid and robot is inside the board
        Coordinates coordinates = robot.getCoordinates();
        if (cmdParser.parse(cmd) && board.isOnBoard(coordinates)) {
            //Display the robot location
            Direction direction = robot.getDirection();
            System.out.println(coordinates.toString() + ", " + direction.name());
            return true;
        }

        return false;
    }
}
