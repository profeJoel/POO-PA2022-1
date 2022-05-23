package GUI;

import javafx.stage.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Emergente {
    public static void mostrar(String titulo, String mensaje){
        Stage ventana = new Stage();
        //Configuración de la ventana Pop-up o Modal
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setTitle(titulo);
        ventana.setMinWidth(250);
        
        Label texto = new Label("Hola: " + mensaje);
        Button boton = new Button("Cerrar");
        boton.setOnAction( e -> ventana.close());

        VBox box = new VBox();
        box.getChildren().addAll(texto, boton);
        box.setAlignment(Pos.CENTER);

        Scene escena = new Scene(box);
        ventana.setScene(escena);
        ventana.showAndWait();
    }
}
