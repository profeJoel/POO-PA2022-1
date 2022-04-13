public class OuterClass{
    //Atributos
    int x = 10;
    //InnerClass
    class InnerClass{
        //atributos
        int y = 5;
        //Metodos
        public InnerClass(){
            System.out.println("Se crea la Clase InnerClass");
        }

    }
    //Metodos
    public OuterClass(){
        System.out.println("Se crea la Clase OuterClass");
    }
}