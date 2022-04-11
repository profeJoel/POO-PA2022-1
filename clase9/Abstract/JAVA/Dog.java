package JAVA;

public class Dog extends Animal{
    private String pedigree;

    public Dog(String name, String species, String pedigree){
        this.name = name;
        this.species = species;
        this.pedigree = pedigree;
    }

    public void makeSound(){
        System.out.println("Wooof!");
    }
}