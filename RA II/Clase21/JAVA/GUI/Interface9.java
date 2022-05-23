package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Interface9 extends Application{
    public static boolean respuesta;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando BorderPane");

        //GridPane
        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10, 10, 10, 10));
        panel.setVgap(4); //4 filas
        panel.setHgap(2);// 2 columnas

        Label bienvenida = new Label("Bienvenido a la interface de Usuario");
        GridPane.setConstraints(bienvenida, 0, 0);

        Label textoUsuario = new Label("Nombre Usuario:");
        GridPane.setConstraints(textoUsuario, 0, 1);
        TextField entradaUsuario = new TextField("Nombre Usuario");
        GridPane.setConstraints(entradaUsuario, 1, 1);

        Label textoPWD = new Label("Password Usuario:");
        GridPane.setConstraints(textoPWD, 0, 2);
        PasswordField entradaPWD = new PasswordField();
        entradaPWD.setPromptText("password");
        GridPane.setConstraints(entradaPWD, 1, 2);

        Button boton = new Button("Ingresar");
        boton.setOnAction(e -> {
            System.out.println("> Usuario es: " + entradaUsuario.getText() + "> pwd: " + entradaPWD.getText());
        });
        GridPane.setConstraints(boton, 1, 3);

        panel.getChildren().addAll(bienvenida, textoUsuario, entradaUsuario, textoPWD, entradaPWD, boton);
        Scene escena = new Scene(panel,500,500);
        //Configuracion de la ventana
        ventana.setScene(escena);
        ventana.show();
    }
}
