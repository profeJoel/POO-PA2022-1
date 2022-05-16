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

public class Interface3 extends Application implements EventHandler<ActionEvent>{
    Button boton2 = new Button();
    Button boton1 = new Button();
    
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando JavaFX");

        HBox disenho = new HBox();
        Label texto1 = new Label("Hola Mundo!!!");
        boton1.setText("OK");
        boton1.setOnAction(this);
        boton2.setText("NO");
        boton2.setOnAction(this);
        

        
        disenho.getChildren().addAll(texto1, boton1, boton2);

        Scene escena = new Scene(disenho, 500, 500);
        ventana.setScene(escena);
        ventana.show();
    }

    @Override
    public void handle(ActionEvent event){
        if(event.getSource() == boton1)
            System.out.println("Las cliickeado el OK!!!!");
        if(event.getSource() == boton2)
            System.out.println("Las cliickeado el NO!!!!");
        
    }
}