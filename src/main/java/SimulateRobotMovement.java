import boards.Board;
import boards.SimpleBoard;
import commands.*;
import robots.Robot;
import robots.SimpleRobot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * The main controller class to simulate the robot movement on the board
 */
public class SimulateRobotMovement {

    private static List<Command> commandList = new ArrayList<Command>();

    /**
     * The main method to start the application
     *
     * @param args the values for board rows and column can be sent
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Robot robot = new SimpleRobot();
        Board board;
        Command command;

        //if the args length == 2 then the rows and column is provided
        if (args.length == 2)
            board = new SimpleBoard(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            //Else initialize it to 5x5
        else board = new SimpleBoard(5, 5);

        initCommandList(robot, board);

        //display the menu
        displayMenu();

        while (true) {
            //get the user command
            System.out.print("Command: ");
            String cmd = console.nextLine();
            //process the command
            command = processCommand(cmd);
            if (command != null && command instanceof QuitCommand)
                break;
        }

        console.close();
    }

    private static void initCommandList(Robot robot, Board board) {
        commandList.add(new LeftCommand(robot, board));
        commandList.add(new RightCommand(robot, board));
        commandList.add(new MoveCommand(robot, board));
        commandList.add(new ReportCommand(robot, board));
        commandList.add(new QuitCommand());
        commandList.add(new PlaceCommand(robot, board));
    }


    private static Command processCommand(String cmd) {
        for (Command command : commandList)
            if (command.execute(cmd)) return command;
        return null;
    }

    /**
     * Method to display the menu
     */
    public static void displayMenu() {
        System.out.println("____________________________");
        System.out.println("Toy Robot Simulation Program");
        System.out.println("____________________________");
        System.out.println();
        System.out.println("Please enter from the following commands (case in-sensitive)...");
        System.out.println("PLACE X, Y, F  - to place the robot on the board, where X is the row number, Y is column number and F is direction(NORTH, SOUTH, EAST, WEST)");
        System.out.println("MOVE - to move the robot 1 step on the board in the assigned direction");
        System.out.println("LEFT - to rotate the robot left 90 degrees");
        System.out.println("RIGHT - to rotate the robot right 90 degrees");
        System.out.println("REPORT - to report the current location of the robot");
        System.out.println("QUIT - to exit the simulation");
        System.out.println();
        System.out.println("____________________________");

    }

}
