public class Main{
    public static void main(String[] args){
        Cat oscar = new Cat(1, "Óscar", "macho", 3, 7, "marrón", "rayada");
        Cat luna = new Cat(2, "Luna", "hembra", 2, 5, "gris", "lisa");

        System.out.println("Tengo dos gatos: " + oscar.getName() + " y " + luna.getName());

        oscar.eat();
        luna.meow();

        Mouse jerry = new Mouse("Jerry");
        Mouse speedy = new Mouse("Speedy");
        oscar.huntMice(jerry);
        luna.huntMice(speedy);


        /**** Problema de Cambiar valores de los atributos */
        //oscar.color = "verde";
        oscar.setColor("verde");
        System.out.println("El color de " + oscar.getName() + " es " + oscar.getColor());
    }
}