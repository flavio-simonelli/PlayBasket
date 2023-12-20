package com.example.progettoispw;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gestisciRichiesteControllerGrafico implements Initializable {
    @FXML
    Label richiesta;
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            System.out.println("prova");
            String file = "C:/Users/samut/OneDrive/Desktop/prova.txt";
            BufferedReader wr = new BufferedReader(new FileReader(file));
            richiesta.setText(wr.readLine());
            wr.close();
        }
        catch(IOException e){
            System.out.println("Errore");

        }
    }
    public void accetta(){
        campoBean campo=new campoBean(richiesta.getText());
        aggiungiCampoControllerApplicativoNormale controller=new aggiungiCampoControllerApplicativoNormale();
        controller.conferma(campo);
    }

}
