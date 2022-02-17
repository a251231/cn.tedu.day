package day5;

import java.util.Random;
import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args) {
        minandmax();

    }

    private static void minandmax() {
        int ranrom = guess();
        System.out.println(ranrom);
        while (true) {
            int input = new Scanner(System.in).nextInt();
            if (input < ranrom) {
                System.out.println("min");
                continue;

            }
            if (input > ranrom) {
                System.out.println("max");
                continue;
            }
            if (input == ranrom) {
                System.out.println("yes");
                break;
            }
        }
    }

    private static int guess() {
        int rom = new Random().nextInt(100);
        return rom;
    }
}

