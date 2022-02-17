package day7;

public class TestExtends {
    public static void main(String[] args) {
        new Animal();
        new Cat();
        new MiaoMiao();
    }
}
class Animal{
    public void eat(){
        System.out.println("小动物animal吃啥都行");
    }
}
class Cat extends Animal{
    int a=10;
    private int b=100;

}
class  MiaoMiao extends Cat{
    public void play(){
        System.out.println(a);
//        System.out.println(b);
    }
    public void stuy(){
        System.out.println("正在学java"+a);
    }
}