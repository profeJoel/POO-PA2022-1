public class Main{
    public static void main(String[] args){
        //crear objeto de la clase OuterClass
        OuterClass A = new OuterClass();
        System.out.println(A.x);

        //Crear un objeto de la clase InnerClass
        OuterClass.InnerClass B = A.new InnerClass();
        System.out.println(B.y);
    }
}