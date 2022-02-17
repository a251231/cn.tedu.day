package day6;

public class TestPrivate2 {
    public static void main(String[] args) {
    Studens studens=new Studens();
    studens.study();
    studens.eat();
    studens.setZhangtai("cgb");
        System.out.println(studens.getZhangtai());
    }

}
class Studens{
    String name;
    String subject;
    int id;
    private String zhangtai;

    public String getZhangtai() {
        return zhangtai;
    }

    public void setZhangtai(String zhangtai) {
        this.zhangtai = zhangtai;
    }

    public void study(){
        System.out.println("study run");
    }
    public void eat(){
        System.out.println("eat run");
    }
    private void run(){
        System.out.println(zhangtai);
    }

}