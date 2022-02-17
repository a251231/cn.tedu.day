package day7;

public class TestTeacher {

}
class Teacher{
    private String name;
    //true为男 false为女
    private boolean gender;
    private double age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Teacher(){

    }
    public Teacher(String name){

    }

    public Teacher(String name, boolean gender, double age, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }
    public String Ready(){
        System.out.println("正在备课");
        String ready = null;
        return ready+"课程备课完毕";
    }
    public void teach(String subject){
        System.out.println("正在授课" + subject);
    }
}