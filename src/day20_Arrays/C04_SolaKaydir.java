package day20_Arrays;

import java.util.Arrays;

public class C04_SolaKaydir {

    public static void main(String[] args) {
         /*
         Verilen 3 elemanli bir array'in tum elemanlarini bir soldaki konuma tasiyacak programi yazin.
           Ornek:
           [1,2,3]  ise output [2,3,1]
          */

        int arr[]={1,2,3};

        int temp=arr[0];

        for (int i = 0; i < arr.length-1 ; i++) {

            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

        //yukarida degistirdigimiz array'i ilk duruma getirmek icin saga kaydiralim.

        temp=arr[arr.length-1];

        for (int i = arr.length-1 ; i >0 ; i--) {
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
