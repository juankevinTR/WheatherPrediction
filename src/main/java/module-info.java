module com.juankevintrujillo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.juankevintrujillo to javafx.fxml;
    exports com.juankevintrujillo;
}