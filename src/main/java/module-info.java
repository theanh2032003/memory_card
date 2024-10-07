module org.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires java.sql;

    opens org.example.demo1 to javafx.fxml;
    exports org.example.demo1;
    exports org.example.demo1.ui;
    opens org.example.demo1.ui to javafx.fxml;
}