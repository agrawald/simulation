package commands;

import boards.Board;
import parsers.CmdParser;
import robots.Robot;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Interface to represent a generic command
 */
public abstract class Command {
    /**
     * Variable to hold the parser for the command
     */
    protected CmdParser cmdParser;

    /**
     * Variable to hold the robot on which the command has to be applied
     */
    protected Robot robot;

    /**
     * Variable to hold the board on which the robot is placed
     */
    protected Board board;

    /**
     * Constructor
     *
     * @param cmdParser parser for the command
     * @param robot     robot
     * @param board     board
     */
    public Command(CmdParser cmdParser, Robot robot, Board board) {
        this.cmdParser = cmdParser;
        this.robot = robot;
        this.board = board;
    }

    /**
     * Constructor
     *
     * @param cmdParser the command parser
     */
    public Command(CmdParser cmdParser) {
        this.cmdParser = cmdParser;
    }

    public abstract boolean execute(String cmd);

}
