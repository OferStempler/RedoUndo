package ofer.stempler.word;

import ofer.stempler.word.service.impl.WordAPIServiceImpl;

/**
 * Created by ofer on 27/04/18.
 */

public class TestCommands {

    public static void main(String[] args) {
        WordAPIServiceImpl wordApi = new WordAPIServiceImpl();

//      Create a waving man
        wordApi.add(" _/\\/\\_\n");
        wordApi.add("  (d_b) ,\n");
        wordApi.add(".__/Y\\_/\n");
        wordApi.add("   |I|\n");
        wordApi.add("   / |\n");
        wordApi.add("  _| |_\n");
        wordApi.print();

        //Remove some  random parts
        wordApi.remove(15,20);
        wordApi.remove(25,30);
        wordApi.print();

        //undo the remove
        wordApi.undo();
        wordApi.undo();
        wordApi.print();

        //underline some partt
        wordApi.underLine(30, 33);
        wordApi.print();

// undo almost all the man
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.undo();
        wordApi.print();

//        //redo it all again
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.redo();
        wordApi.print();

//        Bold some parts
        wordApi.bold(11, 14);
        wordApi.print();
        //    Characters to italics (Does not show on all consoles)
        wordApi.italic(1, 9);
        wordApi.print();

    }

}
