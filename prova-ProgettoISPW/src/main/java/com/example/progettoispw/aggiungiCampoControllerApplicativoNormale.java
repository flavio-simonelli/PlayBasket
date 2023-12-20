package com.example.progettoispw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aggiungiCampoControllerApplicativoNormale extends aggiungiCampoControllerApplicativo{
    @Override
    public void inviaRichiestaManager(requestBean richiesta) {
        try {
            String file = "C:/Users/samut/OneDrive/Desktop/prova.txt";
            BufferedWriter wr = new BufferedWriter(new FileWriter(file));
            wr.write(richiesta.nomeCampo);
            wr.close();
        } catch (IOException e) {
            System.out.println("Errore");
        }
    }
     public void conferma(campoBean param) {
         campoModel campo = new campoModel(param);
         campoDAO dao = new campoDAO();
         dao.salvaCampo(campo);
     }


    }



