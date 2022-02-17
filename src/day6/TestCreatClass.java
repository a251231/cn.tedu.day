package day6;

public class TestCreatClass {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="huawei";
        p.price=10000;
        p.color="远峰蓝";
        p.call();
        p.message();
        p.video();
        System.out.println(p.brand
                +p.price
                +p.color
                +p.size);
        Phone p1=new Phone();
        p1.brand="huawei";
        p1.price=10000;
        p1.color="远峰蓝";
        p1.call();
        p1.message();
        p1.video();
        System.out.println(p1.brand
                +p1.price
                +p1.color
                +p1.size);

    }



}
class Phone{
    String brand;
    double price;
    double size;
    String color;
    public void call(){
        System.out.println("call run");
    }
    public  void  message(){
        System.out.println("message run");
    }
    public  void  video(){
        System.out.println("video run");
    }

}
