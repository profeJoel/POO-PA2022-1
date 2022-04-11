package Interface;

public class Main{
    public static void main(String[] args){
        Post id1 = new Post(1, "http://post.post", "HOOLA");
        id1.escribir("Mundo...");
        id1.verImagen();
        id1.reproducir();
    }
}