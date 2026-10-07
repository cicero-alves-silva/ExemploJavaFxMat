module com.example.exemplojavafxmat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemplojavafxmat to javafx.fxml;
    exports com.example.exemplojavafxmat;
}