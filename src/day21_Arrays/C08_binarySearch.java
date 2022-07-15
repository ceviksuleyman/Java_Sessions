package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {

    public static void main(String[] args) {
        // binarySearch javada eleman aramanin kisayoludur,ancak binarySearch'un calismasi icin once array'in sirali
        // hale getirilmesi gerekir.
        // Eger siralama yapmadan binarySearch yaparsaniz sonucu bulmayabilir veya yanlis bulabilir !!
        String[] harfler = {"Y","B","D","G","O","A"};

        String arananHarf = "A";

        Arrays.binarySearch(harfler,arananHarf);//binarySearch aradigimiz elemanin index'ini dondurur!

        System.out.println(Arrays.binarySearch(harfler,arananHarf));//-1
        //Array sirali olmadigi icin arama sonucunu dogru bulamayabilir once sort yapmamiz gerekir.
        System.out.println(C03_Arrays_contains.contains(harfler,arananHarf));//true

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); // [A, B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler,arananHarf));

        //C03 de yaptigimiz contains method'u arrays.sort() yapmadan once de sonra da bize dogru sonucu dondurdu.
        System.out.println(C03_Arrays_contains.contains(harfler,arananHarf));//true

    }
}
