package ofer.stempler.word.command_model.commands;

import ofer.stempler.word.command_model.Command;
import ofer.stempler.word.command_model.Memento;
import ofer.stempler.word.utils.Utils;

/**
 * Created by ofer on 27/04/18.
 */
public class RemoveCommand extends Command {
    Memento memento = null;
    private static String mainLocalString = null;

  //-----------------------------------------------------------------------
    public String remove(String mainString, int fromPos, int toPos) {
        //validate that position are correct
        String change = Utils.validatePositions(mainString, fromPos, toPos);
        if (change == null){
            //If validation failed, return the word String without changes
            return mainString;
        }
        //Remove from wanted location
        mainString = mainString.replace(change, "");
        mainLocalString = mainString;
        return mainString;
    }
//---------------------------------------------------------------------------
    @Override
    public String execute() {

        memento = new Memento();
        memento.setWord(mainLocalString);
        return mainLocalString;
    }
    //-----------------------------------------------------------------------
    @Override
    public String unExecute() {
        this.mainLocalString = memento.getWord();
        return mainLocalString;
    }
}
