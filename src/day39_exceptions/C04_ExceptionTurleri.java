package day39_exceptions;

public class C04_ExceptionTurleri {

    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        Deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz Java Compile Time'da
        bunu farkeder ve izin vermez.
         */

        str = null;
        //System.out.println(str.length()); //  NullPointerException method kullandigimiz icin RTE

        Object obj = "Java Java Java";
        //Integer sayi = (Integer) obj; //  ClassCastException RTE

        String str2 = "Hava Civa";
        /*Integer sayi2 = str2;
        Java bazi casting islemlerine compile time'da izin vermez.
        Ancak bazen syntax uygun olabilir bu durumda Java kodun calismasina itiraz etmez.
         */

        Thread.sleep(4444); // throws InterruptedException

    }
}

