package com.example.progettoispw;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/*public class HelloController {
    @FXML
    private ImageView imageViewA;

    @FXML
    private ImageView imageViewB;

    public void initialize() {
        // Abilita il trascinamento per ImageView A
        imageViewA.setOnDragOver(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
                if (event.getGestureSource() != imageViewA &&
                        event.getDragboard().hasFiles()) {
                    event.acceptTransferModes(TransferMode.COPY);
                }
                event.consume();
            }
        });

        imageViewA.setOnDragDropped(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasFiles()) {
                    success = true;
                    // Ottieni il percorso del file dell'immagine
                    String imagePath = db.getFiles().get(0).toURI().toString();
                    // Carica l'immagine su ImageView A
                    imageViewA.setImage(new Image(imagePath));
                }
                event.setDropCompleted(success);
                event.consume();
            }
        });

        // Associa un evento per aggiornare ImageView B quando l'immagine su ImageView A cambia
        imageViewA.imageProperty().addListener((obs, oldImage, newImage) -> {
            if (newImage != null) {
                // Copia l'immagine da ImageView A a ImageView B
                imageViewB.setImage(newImage);
            }
        });
    }
}*/
