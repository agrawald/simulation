package parsers;

import java.util.regex.Pattern;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Class represent the parser for the Report command
 */
public class ReportCmdParser extends CmdParser {
    /**
     * Pattern for the report command
     */
    private static final Pattern pattern = Pattern.compile("REPORT", Pattern.CASE_INSENSITIVE);

    /**
     * default constructor initializing the pattern
     */
    public ReportCmdParser() {
        super(pattern);
    }
}
