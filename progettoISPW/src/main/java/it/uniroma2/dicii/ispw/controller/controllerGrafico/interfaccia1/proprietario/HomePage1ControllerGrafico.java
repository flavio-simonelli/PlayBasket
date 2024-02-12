package it.uniroma2.dicii.ispw.controller.controllerGrafico.interfaccia1.proprietario;

import it.uniroma2.dicii.ispw.controller.controllerGrafico.interfaccia1.ControllerGrafico;
import it.uniroma2.dicii.ispw.utils.Session;
import it.uniroma2.dicii.ispw.utils.SessionManager;
import it.uniroma2.dicii.ispw.utils.bean.IdSessioneBean;
import it.uniroma2.dicii.ispw.utils.bean.ProprietarioBean;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomePage1ControllerGrafico extends ControllerGrafico {
    @FXML
    private Label user;
    @Override
    public void inizializza(IdSessioneBean id){
        SessionManager manager=SessionManager.getSessionManager();
        Session session=manager.getSessionFromId(id);
        ProprietarioBean proprietario=session.getProprietarioBean();
        String nome=proprietario.getUsername();
        user.setText("Bentornato "+nome);
    }
}
