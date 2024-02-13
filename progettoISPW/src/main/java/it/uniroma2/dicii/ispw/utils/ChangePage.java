package it.uniroma2.dicii.ispw.utils;

import it.uniroma2.dicii.ispw.Main;
import it.uniroma2.dicii.ispw.controller.controllerGrafico.interfaccia1.ControllerGrafico;
import it.uniroma2.dicii.ispw.utils.bean.IdSessioneBean;
import it.uniroma2.dicii.ispw.utils.bean.Interfaccia1.RichiestaCampoSenzaFotoBean;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangePage {

    private static Stage stage;
    public static void cambiaPagina(String fxml, IdSessioneBean id, RichiestaCampoSenzaFotoBean campoSenzaFotoBean) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxml));
        Scene scene = new Scene(loader.load(), 1200, 760);
        ControllerGrafico controller=loader.getController();    //Uso del polimorfismo, uso una variabile di tipo ControllerGrafico (superclasse)
        controller.inizializza(id,campoSenzaFotoBean);                             //alla quale in base al pagina caricata associo l'istanza di uno dei controller grafici figli
        stage.setScene(scene);                                  //l'operazione inizializza quindi avrà comportamenti diversi in base all'istanza
        stage.show();

    }

    public static void setStage(Stage stageParam){
        stage=stageParam;
    }
}
