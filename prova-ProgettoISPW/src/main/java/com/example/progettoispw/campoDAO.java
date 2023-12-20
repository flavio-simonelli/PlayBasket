package com.example.progettoispw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class campoDAO {
    public String nomeCampo;

    public void salvaCampo(campoModel param){
        try {
            String file = "C:/Users/samut/OneDrive/Desktop/database.txt";
            BufferedWriter wr = new BufferedWriter(new FileWriter(file));
            wr.write(param.nomeCampo);
            wr.close();
        } catch (IOException e) {
            System.out.println("Errore");
        }
    }

}
