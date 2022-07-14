package day21_Arrays;

import java.util.Arrays;

public class C11_Arrays_split {

    public static void main(String[] args) {
        // split() bir array method'u degil, String method'udur, ama array dondurdugu icin bu array'de gorucez...

        String str ="Java ne kadar guzel.";

        String[] kelimeler = str.split(" ");//space'lerden kelimeleri ayirir oncesini ve sonrasini alir
        System.out.println(Arrays.toString(kelimeler));//[Java, ne, kadar, guzel]
        //yukaridaki gibi bir String array olusturup str string'ini split method kullanarak oraya atayip yazdirabiliriz

        //Asagidaki gibi direk de yazdirabiliriz
        System.out.println(Arrays.toString(str.split(" ")));// [Java, ne, kadar, guzel]

        String[] kelimelerNe =str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));// [Java ,  kadar guzel]
        System.out.println(Arrays.toString(str.split("ne")));// [Java ,  kadar guzel]


        String[] kelimelerE = str.split("e");
        System.out.println(Arrays.toString(kelimelerE));//[Java n,  kadar guz, l]
        System.out.println(Arrays.toString(str.split("e")));//[Java n,  kadar guz, l]

        String[] karakterler =str.split("");//hiclik
        System.out.println(Arrays.toString(karakterler));//[J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]
        System.out.println(Arrays.toString(str.split("")));//[J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]

        // NOTE ==> split() ile herhangi bir String'i istedigimiz sekilde parcalara bolup bir Array haline getiriyoruz


    }
}
