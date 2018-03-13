import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Антон on 12.03.2018.
 */
public class StringStorage {

    private static StringBuffer string = new StringBuffer();


    public void add(int num) {

        string.append(num);
    }

    public String get() {
        return string.toString();
    }

}

