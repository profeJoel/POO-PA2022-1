package JAVA;

public class Main{
    public static void main(String[] args){
        Dog firulais = new Dog("firulais","Golden Terrier","Mucho");
        Cat juanito = new Cat("Juanito", "Angora", "negras");

        firulais.makeSound();
        juanito.makeSound();

        Animal algun = new Animal();
        algun.makeSound();
    }
}