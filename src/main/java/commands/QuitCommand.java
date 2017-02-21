package commands;

import parsers.QuitCmdParser;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class to represent a quit command
 */
public class QuitCommand extends Command {
    /**
     * Default Constructor
     */
    public QuitCommand() {
        super(new QuitCmdParser());
    }

    @Override
    public boolean execute(String cmd) {
        if (cmdParser.parse(cmd)) {
            return true;
        }

        return false;
    }
}
