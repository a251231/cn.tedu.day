package day7;

public class TestStatic {
    public static void main(String[] args) {
        Fruit.clean();
        Fruit fruit =new Fruit();
        fruit.grow();
        System.out.println(Fruit.kind);
    }
}
class Fruit{
    static String kind;
    double weight;
    public void grow(){
        System.out.println(weight+kind);
    }
    public  static void clean(){
        System.out.println("666");
    }
}