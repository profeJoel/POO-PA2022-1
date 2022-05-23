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
import javafx.scene.control.TextField;

public class Interface7 extends Application{
    public static boolean respuesta;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando JavaFX");

        VBox box = new VBox();
        Label texto = new Label("Nombre de Usario");
        Label resultado = new Label();
        TextField entrada = new TextField();
        //entrada.setText("Ingrese su nombre");
        entrada.setPromptText("Ingrese su nombre");
        Button boton = new Button();
        boton.setText("Aceptar");
        boton.setOnAction( e -> {
            respuesta = Confirmacion.mostrar("Ventana de confirmación","Hay sueño??");

            if(respuesta)
                resultado.setText("Si, a Mimir!!!");
            else
                resultado.setText("No, Sigamos nomás...");
        });
        box.getChildren().addAll(texto, entrada, boton, resultado);


        Scene escena = new Scene(box,500,500);
        //Configuracion de la ventana
        ventana.setScene(escena);
        ventana.show();
    }
}