package day7;

public class TestConstructor {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student("456");
        Student s2=new Student("456", (int) 465, (char) 456);
    }
}
class Student{
    String name;
    int age;
    char gender;
    public Student(){
        System.out.println("wucan");
    }
    public Student(String s){
        System.out.println("hancan"+s);
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("全参构造");
    }

}
class LS extends Student{
    int score;
    String name;

    public LS(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public LS(String s, int score, String name) {
        super(s);
        this.score = score;
        this.name = name;
    }

    public LS(String name, int age, char gender, int score, String name1) {
        super(name, age, gender);
        this.score = score;
        this.name = name1;
    }
}