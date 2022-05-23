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

public class Interface5 extends Application{
    Scene escena1, escena2;
    
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando JavaFX");

        Button boton1, boton2;

        //Interface 1
        VBox box1 = new VBox();
        Label texto1 = new Label("Escena 1");
        boton1 = new Button();
        boton1.setText("Cambiar a Interface 2");
        boton1.setOnAction( e -> {
            ventana.setScene(escena2);
        });
        box1.getChildren().addAll(texto1,boton1);
        escena1 = new Scene(box1, 500, 500);

        //Interface 2
        HBox box2 = new HBox();
        Label texto2 = new Label("Escena 2");
        boton2 = new Button();
        boton2.setText("Cambiar a Interface 1");
        boton2.setOnAction( e -> {
            ventana.setScene(escena1);
        });
        box2.getChildren().addAll(texto2, boton2);
        escena2 = new Scene(box2, 600, 300);

        //Configuracion de la ventana
        ventana.setScene(escena1);
        ventana.show();
    }
}