package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Interface4 extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando JavaFX");

        HBox disenho = new HBox();
        Label texto1 = new Label("Hola Mundo!!!");
        Button boton1 = new Button();
        boton1.setText("OK");
        boton1.setOnAction( e -> {
            System.out.println("Presionaste el OK!!!");
            System.out.println("Más de una línea de código!!!");
        });
        Button boton2 = new Button();
        boton2.setText("NO");
        boton2.setOnAction( e -> {
            System.out.println("Presionaste el NO!!!");
            System.out.println("---------------------------!!!");
        });
        disenho.getChildren().addAll(texto1, boton1, boton2);

        Scene escena = new Scene(disenho, 500, 500);
        ventana.setScene(escena);
        ventana.show();
    }
}