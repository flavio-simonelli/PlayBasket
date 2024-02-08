module com.example.progettoispw {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens it.uniroma2.dicii.ispw to javafx.fxml;
    exports it.uniroma2.dicii.ispw;
}