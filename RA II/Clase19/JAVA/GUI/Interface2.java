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

public class Interface2 extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando JavaFX");

        HBox disenho = new HBox();
        Label texto1 = new Label("Hola Mundo!!!");
        Button boton = new Button();
        boton.setText("OK");
        boton.setOnAction(
            new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    System.out.println("Las cliickeado el OK!!!!");
                }
            }
        );

        
        disenho.getChildren().addAll(texto1, boton);

        Scene escena = new Scene(disenho, 500, 500);
        ventana.setScene(escena);
        ventana.show();
    }
}