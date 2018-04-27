package ofer.stempler.main.service;

/**
 * Created by ofer on 27/04/18.
 */
public interface WordAPIService {

    void add(String stringToAdd, int position);

    void add(String stringToAdd);

    void remove(int fromPos, int toPos);

    void bold(int fromPos, int toPos);

    void italic(int fromPos, int toPos);

    void underLine(int fromPos, int toPos);

    void undo();

    void redo();

    void print();

}
