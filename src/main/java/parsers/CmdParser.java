package parsers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dheeraj Agrawal on 21/02/17.
 * Teh generic parser to parser a string command
 */
public abstract class CmdParser {
    /**
     * The pattern for the command
     */
    private Pattern pattern;

    /**
     * The groups created from the pattern
     */
    private String[] groups;

    /**
     * Constructor
     *
     * @param pattern the pattern for the command
     */
    public CmdParser(Pattern pattern) {
        this.pattern = pattern;
    }

    /**
     * Method parse the command as per the pattern and set the groups
     *
     * @param cmd the command
     * @return true id successfully parsed
     */
    public boolean parse(String cmd) {
        Matcher matcher = pattern.matcher(cmd);
        if (matcher.matches()) {
            groups = new String[matcher.groupCount() + 1];
            for (int i = 0; i <= matcher.groupCount(); i++)
                groups[i] = matcher.group(i);

            return true;
        }

        return false;
    }

    /**
     * Get the groups created after parsing
     *
     * @return string array of groups
     */
    public String[] getGroups() {
        return groups;
    }
}
