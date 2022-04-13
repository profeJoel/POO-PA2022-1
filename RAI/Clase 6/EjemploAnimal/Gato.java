package EjemploAnimal;

public class Gato extends Mamifero{
    private int largoBigote;

    public Gato(int id, String nombre, boolean puedeSaltar, int largoBigote){
        super(id, nombre, puedeSaltar);
        this.largoBigote = largoBigote;
    }


    public void atacar(){
        System.out.println(this.nombre + " va a arañar...");
    }

    public int getLargoBigote(){
        return this.largoBigote;
    }

    @Override
    public String haceSonido(){
        return this.nombre + " hace Miau!!!...";
    }
}