/**
 * Created by Антон on 13.03.2018.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException{
        StringStorage storage = new StringStorage();
        new ThreadEntity(1, storage);
        new ThreadEntity(2, storage);

        while (true) {
            System.out.println(storage.get());
            Thread.sleep(1000);
        }

    }
}
