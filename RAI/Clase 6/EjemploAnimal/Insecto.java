package EjemploAnimal;

public class Insecto extends Animal{
    private boolean puedeVolar;

    public Insecto(int id, String nombre, boolean puedeVolar){
        super(id, nombre);
        this.puedeVolar = puedeVolar;
    }

    public boolean getPuedeVolar(){
        return this.puedeVolar;
    }

    @Override
    public String haceSonido(){
        return this.nombre + " hace Sonido con su cuerpo";
    }
}