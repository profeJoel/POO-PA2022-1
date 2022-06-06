import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ManejoArchivo1 {
    public static void main(String[] args){
        File archivo = new File("archivo.txt");

        System.out.println("Nombre del Archivo : " + archivo.getName());
        System.out.println("Ruta del Archivo : " + archivo.getAbsolutePath());
        System.out.println("Se puede leer : " + archivo.canRead());
        System.out.println("Se puede escribir : " + archivo.canWrite());
        System.out.println("Exists : " + archivo.exists());
        System.out.println("Tamano : " + archivo.length());

        try{
            Scanner lector = new Scanner(archivo);
            //System.out.println(lector.next());
            //System.out.println(lector.nextLine());

            while(lector.hasNextLine()){
                System.out.println(lector.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println("ERROR: Archivo no existe!!!");
            e.printStackTrace();
        }
    }
    
}
