package Java;

public class Gato implements SerVivo{
    private String nombre;

    public Gato(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String come(String comida){
        return this.nombre + " come " + comida;
    }
}