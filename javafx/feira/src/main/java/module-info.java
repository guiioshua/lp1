module com.example.feira {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.feira to javafx.fxml;
    exports com.example.feira;
}
