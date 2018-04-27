package ofer.stempler.word.service.impl;

import ofer.stempler.word.command_model.EditConstants;
import ofer.stempler.word.command_model.Invoker;
import ofer.stempler.word.command_model.commands.*;
import ofer.stempler.word.service.WordAPIService;

/**
 * Created by ofer on 27/04/18.
 */
public class WordAPIServiceImpl implements WordAPIService {

    Invoker invoker = new Invoker();
    private static String mainString = null;


    @Override
    public void add(String stringToAdd) {
        AddCommand addCommand = new AddCommand();
        mainString = addCommand.add(mainString, stringToAdd);
        invoker.insertCommand(addCommand);
    }
    @Override
    public void add(String stringToAdd, int position) {
        AddCommand addCommand = new AddCommand();
        mainString = addCommand.add(mainString, stringToAdd, position);
        invoker.insertCommand(addCommand);
    }

    @Override
    public void remove(int fromPos, int toPos) {
        RemoveCommand command = new RemoveCommand();
        mainString = command.remove(mainString, fromPos, toPos);
        invoker.insertCommand(command);
    }
    @Override
    public void bold(int fromPos, int toPos) {
        EditPositionCommand command = new EditPositionCommand();
        mainString = command.editPosition(mainString, fromPos, toPos, EditConstants.BOLD_TEXT);
        invoker.insertCommand(command);
    }

    @Override
    public void italic(int fromPos, int toPos) {
        EditPositionCommand command = new EditPositionCommand();
        mainString = command.editPosition(mainString, fromPos, toPos, EditConstants.ITALIC_TEXT);
        invoker.insertCommand(command);
    }

    @Override
    public void underLine(int fromPos, int toPos) {
        EditPositionCommand command = new EditPositionCommand();
        mainString = command.editPosition(mainString, fromPos, toPos, EditConstants.UNDERLINE_TEXT);
        invoker.insertCommand(command);
    }

    @Override
    public void undo() {
        mainString = invoker.undo();
    }

    @Override
    public void redo() {
        mainString = invoker.redo();
    }

    @Override
    public void print() {
//        mainString= invoker.getCurrentString();
        System.out.println(mainString);
    }
}
