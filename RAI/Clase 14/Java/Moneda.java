package Java;

public class Moneda implements Divisa{
    private String nombre;
    private String pais;
    private double ref;

    public Moneda(String nombre, String pais, double ref){
        this.nombre = nombre;
        this.pais = pais;
        this.ref = ref;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getPais(){
        return this.pais;
    }

    public double getRef(){
        return this.ref;
    }

    @Override
    public double cambiarPor(double monto, Divisa divisa){
        double aDolar = ((Moneda) divisa).getRef() * monto; //((Moneda) divisa) cambia el tipo solamente para la operación de Divisa por Moneda
        double cambio = this.getRef() / aDolar;
        return cambio;
    }
}
