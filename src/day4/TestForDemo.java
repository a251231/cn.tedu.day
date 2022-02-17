package day4;

public class TestForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);

        }
        for (int i = 0; i < 6; i++) {
            System.out.println(i);

        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(j * i);
            }
        }
    }
}
