package day4;

public class TestFor {
    public static void main(String[] args) {
        //输出字符
        for (int i = 0; i < 11; i++) {
            System.out.println("world");
        }
//        输出1-10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
//        输出10-1
        for (int i = 10; i >0; i--) {
            System.out.println(i);
        }
//        打印8 88 888
        String s="8";
        for (int i = 0; i < 5; i++) {

            s=s+"8";
            System.out.println(s);

        }
        System.out.println(Integer.parseInt(s));
        int sum=0;
        for (int i = 0; i < 999; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
//        偶数

        int ou=0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                ou=ou+i;
            }

        }
        System.out.println(ou);
    }
}
