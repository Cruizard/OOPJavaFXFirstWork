module com.example.javafxoop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxoop to javafx.fxml;
    exports com.example.javafxoop;
}