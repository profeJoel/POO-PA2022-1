package EjemploAnimal;

public class Arana extends Insecto{
    private boolean esVenenosa;

    public Arana(int id, String nombre, boolean puedeVolar, boolean esVenenosa){
        super(id, nombre, puedeVolar);
        this.esVenenosa = esVenenosa;
    }

    public boolean getEsVenenosa(){
        return this.esVenenosa;
    }

    @Override
    public String haceSonido(){
        return this.nombre + " no hace sonido audible!!!...";
    }
}