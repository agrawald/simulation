package commands;

import boards.Board;
import common.Coordinates;
import common.Direction;
import parsers.MoveCmdParser;
import robots.Robot;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class to represent a move command
 */
public class MoveCommand extends Command {
    /**
     * Constructor
     *
     * @param robot the robot instance
     * @param board the board instance
     */
    public MoveCommand(Robot robot, Board board) {
        super(new MoveCmdParser(), robot, board);
    }

    @Override
    public boolean execute(String cmd) {
        //If the command is valid and robot is inside the board
        if (cmdParser.parse(cmd) && board.isOnBoard(robot.getCoordinates())) {
            //Change the coordinates
            Coordinates coordinates = new Coordinates(robot.getCoordinates().getX(), robot.getCoordinates().getY());
            Direction direction = robot.getDirection();
            switch (direction) {
                case EAST:
                    coordinates.addX(1);
                    break;
                case WEST:
                    coordinates.addX(-1);
                    break;
                case NORTH:
                    coordinates.addY(1);
                    break;
                case SOUTH:
                    coordinates.addY(-1);
                    break;
            }

            //Check if new coordinates are inside the board
            if (board.isOnBoard(coordinates)) {
                //Move the robot to new coordinates
                robot.setCoordinates(coordinates);
                return true;
            } else System.err.println("Robot cannot be moved further");
        }

        return false;
    }
}
