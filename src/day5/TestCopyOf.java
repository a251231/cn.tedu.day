package day5;

import java.util.Arrays;

public class TestCopyOf {
    public static void main(String[] args) {
        int [] from={1,2,3,4,5};
        int[] to= Arrays.copyOf(from,5);
        System.out.println(Arrays.toString(to));
        int[] to1= Arrays.copyOf(from,10);
        System.out.println(Arrays.toString(to1));
    }
}
