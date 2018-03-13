import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    private Service service;

    @FXML
    private Label label;

    {
        service = new Service();
    }

    public void startCount(ActionEvent actionEvent) throws InterruptedException{
        label.textProperty().bind(stringValue());
        service.startCount();

    }

    public void stopCount(ActionEvent actionEvent) {
        service.stopCount();

    }

    public void clearString(ActionEvent actionEvent) {
        service.clearString();

    }


    private ObservableValue<String> stringValue() {
        return service.getString();
    }
}
