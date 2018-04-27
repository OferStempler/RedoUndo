package ofer.stempler.main.command_model.commands;

import ofer.stempler.main.command_model.Command;
import ofer.stempler.main.command_model.Memento;

/**
 * Created by ofer on 27/04/18.
 */
public class AddCommand extends Command {
    Memento memento = null;
    private static String mainLocalString = null;

    //-----------------------------------------------------------------------
    // If no position was given, by default append to the end
    public String add(String mainString , String stringToAdd){
        // if the mainString was not initialized, initialize it
        if (mainString == null) {
            mainString = stringToAdd;
        } else {
            // if the added string is null or empty do nothing
            if(stringToAdd == null || stringToAdd.isEmpty()){
                return mainString;
            }

            mainString = mainString + stringToAdd;
        }
        mainLocalString =   mainString;
        return mainString;
    }
    //-----------------------------------------------------------------------
    public String add(String mainString, String stringToAdd, int position){
        // if the mainString was not initialized, initialize it
        if (mainString == null){
            mainLocalString = stringToAdd;
        } else {
            // Avoid boundException
            if (position > mainString.length()){
                return null;
            }
            else {
                //add wanted string to the main string
                String first = mainString.substring(0, position);
                String last = mainString.substring(position, mainString.length());
                mainString = first + stringToAdd + last ;
            }
        }
        mainLocalString = mainString;
        return mainString;
    }
    //-----------------------------------------------------------------------
    @Override
    public String execute() {

        memento = new Memento();
        memento.setWord(mainLocalString);
        return mainLocalString;
    }

    @Override
    public String unExecute() {

        this.mainLocalString = memento.getWord();
        return mainLocalString;
    }
}
