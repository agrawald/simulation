package parsers;

import java.util.regex.Pattern;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class represent the parser for the Quit command
 */
public class QuitCmdParser extends CmdParser {
    /**
     * Pattern for the quit command
     */
    private static final Pattern pattern = Pattern.compile("Quit", Pattern.CASE_INSENSITIVE);

    /**
     * default constructor initializing the pattern
     */
    public QuitCmdParser() {
        super(pattern);
    }
}
