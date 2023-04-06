module Testify {
    // JavaFX handles our control panel and overlay GUI elements.
    requires javafx.controls;
    requires javafx.fxml;
    // This is for the toggle switch.
    // requires org.controlsfx.controls;
    // Required to play media files.
    requires javafx.media;

    // This allows JavaFX to see our application and controller.
    exports  com.denalidtx.testify to javafx.fxml, javafx.graphics;
}