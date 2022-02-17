package day6;
/*面向对象*/
public class TestCar {
    public static void main(String[] args) {
        Car car=new Car();
        car.setBrand("tgg");
        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        car.start();
    }
}
class Car{
    private  String brand;
    private  String color;
    private  double price;
    private  double length;
    public void start(){
        System.out.println("start");
        stop();
    }
    private void stop(){
        System.out.println("stop");
    }
    public void restart(){
        System.out.println("restart");
    }
    public void draw(){
        System.out.println("draw");
    }
    public void free(){
        System.out.println("free");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}