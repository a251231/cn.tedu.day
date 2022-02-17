package day4;

import java.util.Scanner;

public class TestIf {
//    测试一个人的肥胖
//    接受输入的体重
//    过轻 小于18.5
//    正常 18.5-22.9
//    偏胖 23-24.9
//    重度肥胖 30
//    极度 40
    public static void main(String[] args) {
        System.out.println(health());
    }
    public static double hw(){
        //输入并计算bmi
        System.out.println("输入你的身高(m");
        double h=new Scanner(System.in).nextDouble();
        System.out.println("输入你的体重(kg");
        double w=new Scanner(System.in).nextDouble();
        System.out.println(bmi(h, w));
        return bmi(h, w);
    }

    public static double bmi(double h,double w){
        //    计算bmi
        double bmi =w/(h*h);
        return bmi;
    }

    public static String health() {
//        判断bmi值的区间
        String he = "体重情况";
        double hw=hw();
        if (hw<18.5) {
            he="过轻"
            ;
        }else if (hw<=22.9){
            he="正常";
        }else if (hw<=24.9){
            he="肥胖";
        }
        return he;
    }
}
