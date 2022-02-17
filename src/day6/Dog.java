package day6;

public class Dog {
    public static void main(String[] args) {
        Dog1 dog=new Dog1();
        dog.setHost("马法文");
        System.out.println(dog.getHost());
        dog.bark();
        dog.run();
        dog.play();
        dog.sleep();
        dog.est(8);
    }
}
class Dog1{
    String name;
    String kind;
    double age;
    double price;
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void run(){
        System.out.println("gogogogo");
    }
    public void est(int t){
        System.out.println(t+"根肉骨头" );
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void play(){
        System.out.println("play");
    }
    public void bark(){
        System.out.println("bark");
    }
}