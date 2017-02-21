package parsers;

import java.util.regex.Pattern;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class represent the parser for the Right command
 */
public class RightCmdParser extends CmdParser {
    /**
     * Pattern for the right command
     */
    private static final Pattern pattern = Pattern.compile("RIGHT", Pattern.CASE_INSENSITIVE);

    /**
     * default constructor initializing the pattern
     */
    public RightCmdParser() {
        super(pattern);
    }
}
