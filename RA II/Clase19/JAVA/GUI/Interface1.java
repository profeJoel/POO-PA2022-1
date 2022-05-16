package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Interface1 extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando JavaFX");

        //StackPane disenho = new StackPane();
        //VBox disenho = new VBox();
        HBox disenho = new HBox();
        Label texto1 = new Label("Hola Mundo!!!");
        //Label texto2 = new Label("POO-PA");
        Button boton = new Button();
        boton.setText("OK");

        //disenho.getChildren().add(texto1);
        //disenho.getChildren().add(texto2);
        disenho.getChildren().addAll(texto1, boton);

        Scene escena = new Scene(disenho, 500, 500);
        ventana.setScene(escena);
        ventana.show();
    }
}