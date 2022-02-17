package day7;

public class TestExtends2 {
    public static void main(String[] args) {
        new Son().study();
        Father father=new Father();
        Son son=new Son();
        father.eat();
        son.eat();
    }
}
class Father{
    int sum =10;
    int count =2;
    public void eat(){
        System.out.println("吃肉");
    }

}
class Son extends  Father{
    int sum =100;
    public void study(){
        System.out.println("study");
        System.out.println(sum);
        System.out.println(super.sum);
        System.out.println(count);
    }

    @Override
    public void eat() {
        System.out.println("吃蔬菜");

    }
}