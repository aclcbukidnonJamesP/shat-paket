module com.example.shatpaket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shatpaket to javafx.fxml;
    exports com.example.shatpaket;
}