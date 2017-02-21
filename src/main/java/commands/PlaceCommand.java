package commands;

import boards.Board;
import common.Coordinates;
import common.Direction;
import parsers.PlaceCmdParser;
import robots.Robot;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class to represent a place command
 */
public class PlaceCommand extends Command {
    /**
     * Constructor
     *
     * @param robot the robot instance
     * @param board the board instance
     */
    public PlaceCommand(Robot robot, Board board) {
        super(new PlaceCmdParser(), robot, board);
    }

    @Override
    public boolean execute(String cmd) {
        //If the command is valid
        if (cmdParser.parse(cmd)) {
            //Parse and Create new coordinates
            String[] groups = cmdParser.getGroups();
            Coordinates coordinates = new Coordinates(Integer.parseInt(groups[1]),
                    Integer.parseInt(groups[2]));
            //Check if the new coordinates on the board
            if (board.isOnBoard(coordinates)) {
                //Place the robot on the coordinates
                robot.setCoordinates(coordinates);
                robot.setDirection(Direction.valueOf(groups[3].toUpperCase()));
                return true;
            } else System.err.println("Coordinates out of board: " + coordinates.toString());
        }

        return false;
    }


}
