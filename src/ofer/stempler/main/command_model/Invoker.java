package ofer.stempler.main.command_model;

import java.util.Stack;

/**
 * Created by ofer on 27/04/18.
 */
public class Invoker {
    private int undoRedoPointer = -1;
    private Stack<Command> commandStack = new Stack<>();
//------------------------------------------------------------------------
    public void insertCommand( Command command) {
        deleteElementsAfterPointer(undoRedoPointer);
        command.execute();
        commandStack.push(command);
        undoRedoPointer++;
    }
//------------------------------------------------------------------------

    public void deleteElementsAfterPointer(int undoRedoPointer) {
        if(commandStack.size() < 1) {
            return;
        }
        for(int i = commandStack.size()-1; i > undoRedoPointer; i--) {
            commandStack.remove(i);
        }
    }
    //------------------------------------------------------------------------

    public String undo()
    {
        undoRedoPointer--;

        if (undoRedoPointer == -1){
            //Nothing more to undo, returning empty string
            return "";
        }
        Command command = commandStack.get(undoRedoPointer);
        String mainString = command.unExecute();
        return  mainString;
    }
//------------------------------------------------------------------------

    public String redo()
    {
        if(undoRedoPointer == commandStack.size() - 1) {
            // Nothing more to redo, return last mainString
            Command command = commandStack.get(undoRedoPointer);
            String mainString = command.execute();
            return mainString;
        }
        undoRedoPointer++;
        Command command = commandStack.get(undoRedoPointer);
        String mainString = command.unExecute();
        return mainString;
    }




}
