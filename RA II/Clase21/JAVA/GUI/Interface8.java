package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;

public class Interface8 extends Application{
    public static boolean respuesta;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interface 1: Probando BorderPane");

        //HBox
        HBox menuSuperior = new HBox();
        Button A = new Button("A");
        Button B = new Button("B");
        Button C = new Button("C");
        menuSuperior.getChildren().addAll(A,B,C);

        
        //HBox
        HBox menuInferior = new HBox();
        Button Ab = new Button("A");
        Button Bb = new Button("B");
        Button Cb = new Button("C");
        menuInferior.getChildren().addAll(Ab,Bb,Cb);

        //VBox
        VBox menuLateralIzquierdo = new VBox();
        Button D = new Button("D");
        Button E = new Button("E");
        Button F = new Button("F");
        menuLateralIzquierdo.getChildren().addAll(D,E,F);

        //VBox
        VBox menuCentral = new VBox();
        menuCentral.setAlignment(Pos.CENTER);
        Button Dc = new Button("D");
        Button Ec = new Button("E");
        Button Fc = new Button("F");
        menuCentral.getChildren().addAll(Dc,Ec,Fc);

        //VBox
        VBox menuLateralDerecho = new VBox();
        Button Dd = new Button("D");
        Button Ed = new Button("E");
        Button Fd = new Button("F");
        menuLateralDerecho.getChildren().addAll(Dd,Ed,Fd);

        //BorderPane
        BorderPane panel = new BorderPane();
        panel.setTop(menuSuperior);
        panel.setLeft(menuLateralIzquierdo);
        panel.setCenter(menuCentral);
        panel.setRight(menuLateralDerecho);
        panel.setBottom(menuInferior);

        Scene escena = new Scene(panel,500,500);
        //Configuracion de la ventana
        ventana.setScene(escena);
        ventana.show();
    }
}