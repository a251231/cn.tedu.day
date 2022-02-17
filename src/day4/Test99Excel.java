package day4;

public class Test99Excel {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i+"*"+j+"="+(i * j)+"\t");
            }
            System.out.println("123");
            
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"+"\t");

            }
            System.out.println();
        }
        
    }
}
