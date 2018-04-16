package udc.client.regular.FXMLControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import udc.client.regular.Controller.ClientSuperController;
import udc.objects.time.concrete.Agenda;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DoctorAgendaWeekController extends ClientSuperController implements Initializable {

    @FXML private ListView<?> weekList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void insertFilterData(ArrayList<Agenda> data) {

    }
}