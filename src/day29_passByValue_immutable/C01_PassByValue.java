package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {

    public static void main(String[] args) {
        // 4 elemanli bir array olusturalim sonra ayri bir method'da bu array'in 2. ve 4. elemanlarini 100'den kucuk
        // rastgele bir sayi ile degistirelim ve yeni halini yazdiralim.

        int[] arr = {5,7,8,10};
        //System.out.println(arr); //[I@19dfb72a

        elemanDegistir(arr);

        System.out.println("Main method'un icinde diger method calistiktan sonra : "+Arrays.toString(arr));
        //elemanDegistir method'unda degisiklikten sonra array de degisti
        //referanslar ayni
    }

    private static void elemanDegistir(int[] arr) {

        Random rnd = new Random();

        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);
        //System.out.println(arr); //[I@19dfb72a
        System.out.println("Method'dan gelen array : "+Arrays.toString(arr));

    }
}
