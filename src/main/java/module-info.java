module fr.polytech.polyrentech {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens fr.polytech.polyrentech to javafx.fxml;
    exports fr.polytech.polyrentech;
}