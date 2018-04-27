package ofer.stempler.word.command_model;

/**
 * Created by ofer on 27/04/18.
 */
public final class EditConstants {

    public static final String PLAIN_TEXT = "\033[0m";
    public static final String BOLD_TEXT = "\033[1m";
    public static final String ITALIC_TEXT = "\033[3m";
    public static final String UNDERLINE_TEXT = "\033[4m";

    //Not used in test, but can be easily implemented, just need to add to API
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
}
