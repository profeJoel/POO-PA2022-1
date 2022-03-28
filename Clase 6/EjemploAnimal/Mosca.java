package EjemploAnimal;

public class Mosca extends Insecto{
    private int cantidadOjos;

    public Mosca(int id, String nombre, boolean puedeVolar, int cantidadOjos){
        super(id, nombre, puedeVolar);
        this.cantidadOjos = cantidadOjos;
    }

    public int getCantidadOjos(){
        return this.cantidadOjos;
    }

    @Override
    public String haceSonido(){
        return this.nombre + " hace un zumbido!!!...";
    }
}