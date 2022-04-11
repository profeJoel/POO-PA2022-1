package JAVA;

public class Cat extends Animal{
    private String claws;

    public Cat(String name, String species, String claws){
        this.name = name;
        this.species = species;
        this.claws = claws;
    }

    public void makeSound(){
        System.out.println("Miauu!");
    }
}