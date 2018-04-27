package ofer.stempler.word.utils;

/**
 * Created by ofer on 27/04/18.
 */
public class Utils {
    public static String validatePositions(String mainString, int fromPos, int toPos){

        if(     mainString != null            &&
                fromPos < toPos               &&
                fromPos < mainString.length() &&
                toPos   <= mainString.length()){
            return mainString.substring(fromPos, toPos);
        } else {
            return null;
        }
    }
}
