package day5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArryExec {
    public static void main(String[] args) {
        getMonthDay();
        setMonthDay(new Scanner(System.in).nextInt());
    }

    private static void setMonthDay(int t) {
        int a[]=new int[t];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void getMonthDay() {
        int[] a={31,28,31};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println(a.length);
        }


    }

}
