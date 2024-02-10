package it.uniroma2.dicii.ispw.controller.controllerGrafico.interfaccia1;

import it.uniroma2.dicii.ispw.controller.controllerApplicativo.LoginControllerApplicativo;
import it.uniroma2.dicii.ispw.utils.bean.CredentialsBean;
import it.uniroma2.dicii.ispw.utils.bean.Role;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class Login1ControllerGrafico {
    @FXML
    private ToggleButton proprietario;
    @FXML
    private ToggleButton giocatore;
    @FXML
    private ToggleButton gestore;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button registrazione;
    @FXML
    private Button accesso;
    @FXML
    private Label avviso;
    @FXML
    private void clickAccesso() {
        CredentialsBean cred=new CredentialsBean(username.getText(),password.getText());
        if (proprietario.isSelected()) {
            cred.setRole(Role.PROPRIETARIO);

        } else if (giocatore.isSelected()) {
            cred.setRole(Role.GIOCATORE);

        } else if (gestore.isSelected()) {
            cred.setRole(Role.GESTORE);

        } else {
            avviso.setText("Attenzione, seleziona un ruolo!");
            return;
        }
        LoginControllerApplicativo loginController = new LoginControllerApplicativo();
        loginController.login(cred);

        // cambia pagina

    }
}
