package com.mariston.weekone.hello;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/10/20 22:17
 */
public class Hello {

    public static void main(String[] args) {

        int a = 1;

        long b = 10L;

        float c = 10.5F;

        double d = 4.01D;

        System.out.println((a + b - c) * d);

        int[] array = new int[]{2, 4, 5, 4, 1};
        for (int num : array) {
            if (num == 4) {
                System.out.println(num);
            }
        }
    }

}
