package day21_Arrays;

import java.util.Arrays;

public class C07_Arrays_sort {

    public static void main(String[] args) {

        int[] sayilar = {3,4,7,8,9,5,6,3};

        //Array'i Arrays Class'ini kullanarak natural sirali hale getirebiliriz
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));

    }
}
