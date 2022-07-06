module com.example.cinemaprojecttrue {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.cinemaprojecttrue to javafx.fxml;
    exports com.example.cinemaprojecttrue;
}