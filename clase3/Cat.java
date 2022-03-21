
public class Cat{
    //Atributos
    int id;
    String name;
    String sex;
    double age;
    double weight;
    String color;
    String texture;

    //Métodos
    //Constructor
    public Cat(){ }
    public Cat(int id, String name,String sex, double age, double weight, String color, String texture){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    //comunes - personalizados
    public void eat(){
        System.out.println(this.name + " esta comiendo...");
    }

    public void move(String direction){
        System.out.println(this.name + " se mueve a " + direction);
    }

    public void meow(){
        System.out.println(this.name + " Dice Meow...");
    }

    public void purr(){
        System.out.println(this.name + " Ronronea...");
    }

    public Mouse huntMice(Mouse hunted){
        System.out.println(this.name + " Cazó a " + hunted.name);
        return hunted;
    }

}