
public class Cat{
    //Atributos
    private int id;
    private String name;
    private String sex;
    private double age;
    private double weight;
    private String color;
    private String texture;

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
        System.out.println(this.name + " Cazó a " + hunted.getName());
        return hunted;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        int i;
        String[] colores = {"Rojizo", "Negro", "Blanco", "orange", "gris", "marrón"};
        for(i=0; i<6; i++)
            if(colores[i] == color)
                this.color = color;
        if(i>= 6)
            System.out.println("El color no está disponible");
    }

}