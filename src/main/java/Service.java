import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Антон on 12.03.2018.
 */
public class Service {

    private StringStorage storage;

    {
        storage = new StringStorage();
    }

    public void startCount() {
        if(storage.getThreads().size()==0) {
            ThreadEntity.setIsStopped(false);
            storage.getThreads().add(new Thread(new ThreadEntity(1, storage)));
            storage.getThreads().add(new Thread(new ThreadEntity(2, storage)));
            storage.getThreads().forEach(t -> t.start());
        }
    }

    public void stopCount() {
        ThreadEntity.setIsStopped(true);
        storage.getThreads().clear();
    }

    public void clearString() {
        storage.clear();
    }

    public SimpleStringProperty getString() {
        return storage.get();
    }
}
