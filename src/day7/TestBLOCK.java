package day7;

public class TestBLOCK {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person(5);
    }
}
class Person{
    {
        System.out.println("构造代码块");
    }

    public Person() {
    }
    public Person(int t){
        System.out.println(t);
    }
}
