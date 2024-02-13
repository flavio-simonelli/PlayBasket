package it.uniroma2.dicii.ispw.controller.controllerGrafico.interfaccia1.proprietario;

import it.uniroma2.dicii.ispw.controller.controllerGrafico.interfaccia1.ControllerGrafico;
import it.uniroma2.dicii.ispw.utils.Session;
import it.uniroma2.dicii.ispw.utils.SessionManager;
import it.uniroma2.dicii.ispw.utils.bean.IdSessioneBean;
import it.uniroma2.dicii.ispw.utils.bean.Interfaccia1.RichiestaCampoSenzaFotoBean;
import it.uniroma2.dicii.ispw.utils.bean.ProprietarioBean;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SalvaInvia1ControllerGrafico extends ControllerGrafico {
    private IdSessioneBean id;
    @FXML
    private Label nome;
    @FXML
    private Label indirizzo;
    @FXML
    private Label tariffa;
    @FXML
    private Label apertura;
    @FXML
    private Label chiusura;
    @FXML
    private Label iban;
    @Override
    public void inizializza(IdSessioneBean id, RichiestaCampoSenzaFotoBean campoSenzaFotoBean){
        this.id=id;
        nome.setText(campoSenzaFotoBean.getNomeCampo());
        //Continua con gli altri campi

    }
}
