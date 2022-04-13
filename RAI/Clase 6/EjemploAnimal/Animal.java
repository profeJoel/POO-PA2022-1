/** Super Clase */

package EjemploAnimal;

public class Animal{
    protected int id;
    protected String nombre;

    public Animal(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getID(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String haceSonido(){
        return this.nombre + " hace Sonido!!!...";
    }

    //@Override
    public String ToString(){
        return "El Animal es: " + this.nombre + "(" + this.id + ")";
    }
}