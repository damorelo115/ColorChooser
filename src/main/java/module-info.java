module lauren.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens lauren.colorchooser to javafx.fxml;
    exports lauren.colorchooser;
}