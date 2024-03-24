module com.example.csc325uidoctor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc325uidoctor to javafx.fxml;
    exports com.example.csc325uidoctor;
}