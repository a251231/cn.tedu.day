package day4;
//测试重载现象
public class MethodOverload {
    public static void main(String[] args) {

    }
    //        创建无参
    public static void method(){
        System.out.println("无参");
    }
    //        创建参
    public static void method1(int i){
        System.out.println("无参");
    }
    //        创建参且返回值
    public static boolean method2(int i){
        System.out.println("无参");
        return true;
    }
}
