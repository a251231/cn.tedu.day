package day4;
/***/
public class TestVaeiable {
    //创建成员变量
//        位置 在类里方法外
//        注意事项 无需手动初始化 会赋予对应类型成员变量的默认值
//        作用域 在整个类中都生效，类消失，成员变量才消失
    int sum=101;
    public static void main(String[] args) {
//创建局部变量
//        位置 在方法或局部代码块
//        注意事项 必须手动初始化
//        作用域 在方法或局部代码块中 当对应的代码执行完毕 局部变量随之消失
        int sum =100;
        System.out.println(sum);

    }
}
