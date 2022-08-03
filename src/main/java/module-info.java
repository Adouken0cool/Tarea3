module com.example.tarea3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea3 to javafx.fxml;
    exports com.example.tarea3;
    exports Tarea3;
    opens Tarea3 to javafx.fxml;
}