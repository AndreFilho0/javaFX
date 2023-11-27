module com.example.javafxaprendendo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxaprendendo to javafx.fxml;
    exports com.example.javafxaprendendo;
}