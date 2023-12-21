module com.example.progettoispw {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.progettoispw to javafx.fxml;
    exports com.example.progettoispw;


}