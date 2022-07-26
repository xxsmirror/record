package test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] ax = new int[50];
        Random random = null;
        for (int i = 0; i < ax.length; i++) {
            random = new Random();
            int a = random.nextInt(500)-200;
            ax[i]=a;
        }

        Arrays.stream(ax).forEach(System.out::println);

    }
}
