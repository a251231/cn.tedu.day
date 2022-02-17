package day7;

public class TestThis {

}
class Car{
    int id;
    String brand;
    double price;
    public void run(){
        int id= 100;
        System.out.println(id);
        System.out.println(this.id);
    }

    public Car(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public Car(int id) {
        this.id = id;
    }
}