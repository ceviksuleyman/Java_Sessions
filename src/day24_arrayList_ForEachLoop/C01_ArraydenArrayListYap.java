package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYap {

    public static void main(String[] args) {

        String[] arr = {"ismail","nurulah","fatih"};
        // uzun list'ler olusturmamiz gerektiginde tek tek eklemek yerine array olusturup,bunlari liste cevirmek daha
        // pratik olabilir.

        // 1- loop ile array'deki tum elementleri list'e atabiliriz.

        // 2- Arrays.asList() method'una da kullanabiliriz, ancak bu method'un 2 kotu yan etkisi var.
        //    => Arrays class'i kullanildigi icin array ozellikleri gecerli olur dolayisiyla list'te olan add(),
        // remove() gibi size()'i degistiren method'lar bu bu sekilde olusturulan list'lerde KULLANILAMAZ !
        //    => Kaynak olan array ile urun olan list ozdeslestirilir,birinde yapilan degisiklik otomatik olarak
        // digerine de islenir.


        // asList kullanarak array'i arraylist'e cevirdik
        List<String> sinirListesi = Arrays.asList(arr);
        System.out.println(sinirListesi);// [ismail, nurulah, fatih]

        // 1. yan etki asList() kullaniminda,
        // sinirListesi.add("erdi");array'dan array list'e cevirdigimiz list'e isim ekledik fakat eklenmedi exception!!
        // System.out.println(sinirListesi);
        //  sinirListesi.remove(1); remove() method'u da calismiyor ! exception



        // 2 yan etki asList() kullaniminda,
        arr[1] = "murtaza";
        //biz sadece array'de degisiklik yaptigimiz halde degisiklik arraylist'de gecerli oldu !
        System.out.println("Degisim sonrasi array : "+Arrays.toString(arr));// [ismail, murtaza, fatih]
        System.out.println("array'i degisitirince list : "+sinirListesi); //  [ismail, murtaza, fatih]


        sinirListesi.set(0,"suleyman");
        // burda da arraylist'deki elemani degistirdik fakat degisiklik array'de de gecerli oldu bu asList sorunlu!
        System.out.println("list'i degistirince list : "+sinirListesi);// [suleyman, murtaza, fatih]
        System.out.println("List'i degistirince array : "+Arrays.toString(arr));// [suleyman, murtaza, fatih]



    }
}
