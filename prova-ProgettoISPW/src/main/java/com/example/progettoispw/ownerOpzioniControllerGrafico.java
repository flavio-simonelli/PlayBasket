package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ownerOpzioniControllerGrafico {
    @FXML
    Button aggiungiCampo;

    public void cambiaScena(){
        aggiungiCampoControllerApplicativoNormale controller=new aggiungiCampoControllerApplicativoNormale();

        NavigationController var=NavigationController.getIstance();
        var.cambiaPagina("Interfacce/Owner/AggiungiCampo/compilaScheda.fxml",null);

    }
    public void gestisciRichieste(){
        aggiungiCampoControllerApplicativoNormale controller=new aggiungiCampoControllerApplicativoNormale();

        NavigationController var=NavigationController.getIstance();
        var.cambiaPagina("Interfacce/Owner/gestisciRichieste.fxml",null);

    }

}
