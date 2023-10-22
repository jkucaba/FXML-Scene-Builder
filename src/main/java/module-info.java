module com.jakubku.fxml.fxmldemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.fxml.fxmldemo to javafx.fxml;
    exports com.jakubku.fxml.fxmldemo;
}