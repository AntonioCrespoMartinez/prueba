module com.example.dinterfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dinterfaces to javafx.fxml;
    exports com.example.dinterfaces;
}