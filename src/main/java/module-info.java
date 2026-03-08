module org.example.oopjavafxassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.oopjavafxassignment to javafx.fxml;
    exports org.example.oopjavafxassignment;
}