package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class salvaInviaControllerGrafico {
    @FXML
    Label nomeCampo;
    @FXML
    public void conferma(){
        requestBean richiesta=new requestBean(nomeCampo.getText(),0);
        aggiungiCampoControllerApplicativoNormale controller=new aggiungiCampoControllerApplicativoNormale();
        aggiungiCampoControllerApplicativoVip vip=new aggiungiCampoControllerApplicativoVip(controller);
        //aggiungiCampoControllerApplicativoUltra ultra=new aggiungiCampoControllerApplicativoUltra(controller);
        vip.inviaRichiestaManager(richiesta);
        NavigationController var=NavigationController.getIstance();
        var.cambiaPagina("Interfacce/Owner/homePage.fxml",null);
    }
}
