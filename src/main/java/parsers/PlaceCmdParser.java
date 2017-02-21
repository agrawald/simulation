package parsers;

import java.util.regex.Pattern;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class represent the parser for the Place command
 */
public class PlaceCmdParser extends CmdParser {
    /**
     * Pattern for the place command
     */
    private static final Pattern pattern = Pattern.compile("PLACE (?<X>\\p{Digit}+)\\s*,\\s*(?<Y>\\p{Digit}+)\\s*,\\s*(?<F>NORTH|EAST|WEST|SOUTH)\\s*"
            , Pattern.CASE_INSENSITIVE);

    /**
     * default constructor initializing the pattern
     */
    public PlaceCmdParser() {
        super(pattern);
    }
}
