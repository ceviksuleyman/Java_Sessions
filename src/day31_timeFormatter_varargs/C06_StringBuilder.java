package day31_timeFormatter_varargs;

public class C06_StringBuilder {
     /*
    => StringBuilder "mutable" yeni degistirilebilir String elde etmemize olanak tanir.

    => Boylece hafizada her seferinde yeni bir alan acilmadan var olan alan uzerinde degisiklik yapilabilir
    bu da StringBuilder sinifini hafiza kullanimi olarak String sinifinin onune gecirir.

    => StringBuilder thread-safe degildir,yani synchronized degildir.Thread'li bir islem kullanilacaksa StringBuilder
    kullanilmasi guvenli degildir.

    NOTE => StringBuffer ,StringBuilder'a benzer. StringBuilder,StringBuffer'dan hizlidir.
    Multi-thread icin StringBufffer kullanilir.
     */

    public static void main(String[] args) {

        // 3 farkli sekilde StringBuilder olusturulabilir.

        StringBuilder sb1 = new StringBuilder(); // bos bir Stringbuilder

        StringBuilder sb2 = new StringBuilder("animal"); // belli bir degeri olan StringBuilder

        StringBuilder sb3 = new StringBuilder(5);// ilk uzunlugu tahmin edilen bir StringBuilder olusturur.
        sb3.append("Murtaza ");
        sb3.append("Veli ");
        sb3.append("Ali ");
        sb3.append("werwerwe ");
        sb3.append("sdfsdfsdf ");
        sb3.append("asdasdasd");

        System.out.println(sb3.toString().toUpperCase());
        System.out.println(sb3.reverse());
    }
}
