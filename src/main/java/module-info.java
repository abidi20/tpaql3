module com.example.tp3parte1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp3parte1 to javafx.fxml;
    exports com.example.tp3parte1;
}