package ofer.stempler.word;

import ofer.stempler.word.service.impl.WordAPIServiceImpl;

/**
 * Created by ofer on 27/04/18.
 */


public class TestCommands2 {

    public static void main(String[] args) {
        WordAPIServiceImpl wordApi = new WordAPIServiceImpl();


        wordApi.add("check this thing.");
        wordApi.print();
        wordApi.add("Hello hello, ", 0);
        wordApi.print();
        wordApi.remove(0, 30);
        wordApi.add("it can remove parts");
        wordApi.print();
        wordApi.remove(0, 19);
        wordApi.add("And it can make some letters bold");
        wordApi.bold(21, 33);
        wordApi.print();
        wordApi.add(", and some underlined");
        wordApi.underLine(47 , 62);
        wordApi.print();
        wordApi.remove(0, 66);
        wordApi.add("It can go back and forth in time...");
        wordApi.print();

        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();

        wordApi.print();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();


        wordApi.print();

        wordApi.remove(0, 70);
        wordApi.add("I hope it will be used only for good things. Amen");
        wordApi.bold(45, 49);
        wordApi.print();



    }

}
