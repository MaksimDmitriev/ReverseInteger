package com.app;

public class Main {

    public static void main(String[] args) {
        System.out.print(reverse(120));
    }

    public static int reverse(int x) {
        if (Integer.MIN_VALUE == x) {
            return 0;
        }
        final int y = x < 0 ? -x : x;
        final String str = reverseStr(Integer.toString(y));
        return Long.parseLong(str) > Integer.MAX_VALUE ? 0 : (x < 0 ? -Integer.parseInt(str) : Integer.parseInt(str));
    }

    private static String reverseStr(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return new String(array);
    }
}
