module com.example.minipayrollgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minipayrollgui to javafx.fxml;
    exports com.example.minipayrollgui;
}