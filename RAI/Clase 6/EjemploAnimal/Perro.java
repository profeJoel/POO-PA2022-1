package EjemploAnimal;

public class Perro extends Mamifero{
    private boolean colaCortada;

    public Perro(int id, String nombre, boolean puedeSaltar, boolean colaCortada){
        super(id, nombre, puedeSaltar);
        this.colaCortada = colaCortada;
    }

    public void atacar(){
        System.out.println(this.nombre + " va a morder...");
    }
    
    public void atacar(Gato enemigo){
        System.out.println(this.nombre + " va a morder al " + enemigo.getNombre());
    }

    public boolean getColaCortada(){
        return this.colaCortada;
    }

    @Override
    public String haceSonido(){
        return this.nombre + " hace Guau!!!...";
    }
}