package EjemploAnimal;

public class Vaca extends Mamifero{
    private int cantidadManchas;

    public Vaca(int id, String nombre, boolean puedeSaltar, int cantidadManchas){
        super(id, nombre, puedeSaltar);
        this.cantidadManchas = cantidadManchas;
    }

    public int getCantidadManchas(){
        return this.cantidadManchas;
    }

    @Override
    public String haceSonido(){
        return this.nombre + " hace Muuu!!!...";
    }
}