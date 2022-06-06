import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class EscrituraArchivo {
    public static void main(String[] args){
        /*** Crear un archivo nuevo con código java */
        try {
            //File nuevoArchivo = new File("cancionero.txt");
            File nuevoArchivo = new File("cancionero.csv");
            if(nuevoArchivo.createNewFile()){
                System.out.println("Archivo Creado: " + nuevoArchivo.getName());
            }
            else{
                System.out.println("El archivo ya existe!!");
            }
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("ERROR: Ocurrió un error en la creación del archivo");
            e.printStackTrace();
        }

        /**Escritura o sobreescritura del archivo cancionero */
        try {
            //FileWriter escritor = new FileWriter("cancionero.txt");
            FileWriter escritor = new FileWriter("cancionero.csv");
            escritor.write("cancion, autor\n");
            escritor.write("'Torero', 'Chayanne'\n");
            escritor.write("'Pose','Daddy Yankey'\n");
            escritor.write("'Ultrasolo','Pailita'\n");
            escritor.close();
            System.out.println("La escritura del archivo fue realizada con éxito!!!");
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("ERROR: Ocurrió un error en la escritura del archivo!!");
            e.printStackTrace();
        }

        /**Escritura al final del archivo cancionero */
        try {
            //FileWriter escritor = new FileWriter("cancionero.txt", true);
            FileWriter escritor = new FileWriter("cancionero.csv", true);
            escritor.append("'Persiana Americana','Soda Stereo'\n");
            escritor.close();
            System.out.println("La escritura del archivo fue realizada con éxito!!!");
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("ERROR: Ocurrió un error en la escritura del archivo!!");
            e.printStackTrace();
        }
    }
}
