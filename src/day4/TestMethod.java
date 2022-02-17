package day4;

public class TestMethod {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        method();
        method1(18);
    }
    public static void method(){
        System.out.println(3);
    }
    public static void method1(int i){
        System.out.println("海绵宝宝今年"+i+"岁了");
    }
}
