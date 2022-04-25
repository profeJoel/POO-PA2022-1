/**
 * Ubicación  : 'POO-PA2022-1/RAI/Clase 14/'
 * Compilación: javac Java/CasaCambio.java
 * Ejecución  : java Java.CasaCambio 
 */

package Java;

public class CasaCambio {
    
    public static void main(String[] args){
        Moneda dolar = new Moneda("usd", "USA", 1);
        Moneda euro = new Moneda("eur", "EU", 0.93);
        Moneda libra = new Moneda("libra", "UK", 0.78);
        Moneda peso = new Moneda("clp", "Chile", 845);
    
        double monto = 1;
        System.out.println("> " + monto + " "+ dolar.getNombre() + " son " + peso.cambiarPor(monto,dolar) + " " + peso.getNombre());
    }
    
}
