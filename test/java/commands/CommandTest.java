package commands;

import boards.Board;
import boards.SimpleBoard;
import common.Coordinates;
import common.Direction;
import robots.Robot;
import robots.SimpleRobot;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 */
public abstract class CommandTest {
    Robot robot;
    Command command;
    Board board;

    public void setup() {
        this.robot = new SimpleRobot(new Coordinates(0, 0), Direction.NORTH);
        this.board = new SimpleBoard(5, 5);
    }
}
