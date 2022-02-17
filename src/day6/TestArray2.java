package day6;

import java.util.Arrays;

public class TestArray2 {
    public static void main(String[] args) {
        int[] from={1,2,3,4,5};
        int[] to1= Arrays.copyOf(from,5);
        int[] to2= Arrays.copyOf(from,15);

        int[] to3= Arrays.copyOf(from,3);
        System.out.println(Arrays.toString(to1));
        System.out.println(Arrays.toString(to2));
        System.out.println(Arrays.toString(to3));
    }
}
