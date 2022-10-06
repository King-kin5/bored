module com.example.bored {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bored to javafx.fxml;
    exports com.example.bored;
}