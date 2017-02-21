package parsers;

import java.util.regex.Pattern;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class represent the parser for the Left command
 */
public class LeftCmdParser extends CmdParser {

    /**
     * Pattern for the left command
     */
    private static final Pattern pattern = Pattern.compile("LEFT", Pattern.CASE_INSENSITIVE);

    /**
     * default constructor initializing the pattern
     */
    public LeftCmdParser() {
        super(pattern);
    }
}
