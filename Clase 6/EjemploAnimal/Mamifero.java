/** Sub clase de Animal */

package EjemploAnimal;

public class Mamifero extends Animal{
    private boolean puedeSaltar;

    public Mamifero(int id, String nombre, boolean puedeSaltar){
        super(id, nombre);
        this.puedeSaltar = puedeSaltar;
    }

    public boolean getPuedeSaltar(){
        return this.puedeSaltar;
    }

    @Override
    public String haceSonido(){
        return this.nombre + " hace Sonido con su hocico...";
    }
}