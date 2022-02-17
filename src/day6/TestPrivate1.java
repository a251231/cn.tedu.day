package day6;
    public class TestPrivate1 {
    public static void main(String[] args) {
        User u= new User();
//        u.moner=1000;
        u.id=13124134;
        System.out.println(u.getMoner());
//        System.out.println(u.getMoner());
//                u.name="东子";
    }
}
class User{
    public String name;
    //私有变量
    private double moner=100;
    public int id;
    public double getMoner(){
        return moner;
    }
}
