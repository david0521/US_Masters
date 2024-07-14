module com.example.us_masters {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.us_masters to javafx.fxml;
    exports com.example.us_masters;
}