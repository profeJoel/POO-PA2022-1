package EjemploAnimal;

public class Main{
    public static void main(String[] args){
        Animal obj1 = new Animal(1, "boby");
        Mamifero obj2 = new Mamifero(2, "Charly", true);
        Perro obj3 = new Perro(3, "Delta", true, false);
        Gato obj4 = new Gato(4, "Neko", true, 5);
        Vaca obj5 = new Vaca(5, "Lola", true, 10);
        Insecto obj6 = new Insecto(6, "Mantis", true);
        Arana obj7 = new Arana(7, "Peter", false, true);
        Mosca obj8 = new Mosca(8, "Brian", true, 10000);

        /*System.out.println("El nombre del obj1 es: " + obj1.getNombre());
        System.out.println("El nombre del obj2 es: " + obj2.getNombre());
        System.out.println("El nombre del obj3 es: " + obj3.getNombre());
        */
        mostrarNombreAnimal(obj1);
        mostrarNombreAnimal(obj2);
        mostrarNombreAnimal(obj3);
        mostrarNombreAnimal(obj4);
        mostrarNombreAnimal(obj5);
        mostrarNombreAnimal(obj6);
        mostrarNombreAnimal(obj7);
        mostrarNombreAnimal(obj8);


        obj3.atacar();
        obj3.atacar(obj4);
        obj4.atacar();

    }

    public static void mostrarNombreAnimal(Animal a){
        //System.out.println("\n\nEl nombre del Animal es: " + a.haceSonido());
        System.out.println("\n\nEl nombre del Animal es: " + a.ToString());
    }
}