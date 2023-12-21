package com.example.progettoispw;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavigationController {

    private Stage primaryStage;
    private static NavigationController istance;
    public static NavigationController getIstance(){
        if(NavigationController.istance==null){
            NavigationController.istance=new NavigationController();

        }
        return NavigationController.istance;

    }
    public void setParam(Stage param){
        this.primaryStage=param;
    }


    // Metodo per caricare e mostrare una pagina
    public void cambiaPagina(String fxmlFileName,String nomeCampo) {
        System.out.println("entrato");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Scene scene = new Scene(loader.load(), 1200, 760);
            if(nomeCampo!=null) {
                salvaInviaControllerGrafico controller = loader.getController();
                controller.nomeCampo.setText(nomeCampo);
                loader.setController(controller);
            }
            //Scene scene = new Scene(loader.load(), 1200, 760);
            this.primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

