package com.example.progettoispw;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

public class compilaSchedaControllerGrafico {
    @FXML
    TextField nomeCampo;
    @FXML
    Button avanti;
    public void cambiaScena(){

        NavigationController var=NavigationController.getIstance();
       /* salvaInviaControllerGrafico controller=new salvaInviaControllerGrafico();
        controller.nomeCampo.setText(nomeCampo.getText());*/

        var.cambiaPagina("Interfacce/Owner/AggiungiCampo/salvaInvia.fxml",nomeCampo.getText());

    }

}
