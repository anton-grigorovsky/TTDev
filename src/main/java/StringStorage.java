import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Антон on 12.03.2018.
 */
public class StringStorage {

    private static StringBuffer string = new StringBuffer();
    private static List<Thread> threads = new ArrayList<>();
    static SimpleStringProperty stringProperty = new SimpleStringProperty();


    public void add(int num) {

        string.append(num);
        Platform.runLater(() -> stringProperty.set(string.toString()));
    }

    public SimpleStringProperty get() {
        return stringProperty;
    }

    public void clear() {
        string.setLength(0);
        stringProperty.set(string.toString());
    }

    public List<Thread> getThreads() {
        return threads;
    }



}

