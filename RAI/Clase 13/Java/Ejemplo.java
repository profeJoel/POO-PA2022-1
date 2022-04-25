package Java;

public class Ejemplo {
    public static void main(String[] args){
        //No se puede realizar esta instanciación
        //SerVivo animal = new SerVivo();

        Gato minino = new Gato("Minino");
        minino.come("ratón");

        //Lambda Expression : (params) -> {expression};
        SerVivo perro = (comida) -> "El perro come " + comida;
        System.out.println(perro.come("gato"));
        //imprimirElemento(perro, "gato");
    }

    /*public static void imprimirElemento(SerVivo a, String c){
        String mensaje = a.come(c);
        System.out.println("Texto con Lambda: " + mensaje);
    }*/

}
