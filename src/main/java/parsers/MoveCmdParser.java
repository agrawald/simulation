package parsers;

import java.util.regex.Pattern;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class represent the parser for the Move command
 */
public class MoveCmdParser extends CmdParser {
    /**
     * Pattern for the move command
     */
    private static final Pattern pattern = Pattern.compile("MOVE", Pattern.CASE_INSENSITIVE);

    /**
     * default constructor initializing the pattern
     */
    public MoveCmdParser() {
        super(pattern);
    }
}
