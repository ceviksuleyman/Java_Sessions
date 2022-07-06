package day11_stringManipulation;

public class C02_indexOf {

    public static void main(String[] args) {

        String str1="Java ogrenmek cok guzel";
        /*  indexOf:
        Verilen bir String'de herhangi bir string veya char'in ilk kullanildigi index'i bize dondurur
         */

        System.out.println(str1.indexOf('g')); //6
        System.out.println(str1.indexOf("r")); //7
        System.out.println(str1.indexOf("j")); //-1 Java istenilen index yoksa her zaman -1 dondurur !!!!

        System.out.println(str1.indexOf("mek"));//10 burayi bir blok gibi dusunur ve ilk harfin index'ini verir

        /*
         Eger istedigimiz index'den sonrasini kontrol etmek istersek  o zaman ayni
         method'u iki parametreli olarak kullanabiliriz
         */
        System.out.println(str1.indexOf("g",6+1));//18 sadece 6 yazarsak ilk g indexi oldugundan 6 verir
        //yukaridaki str1'da 2. ve 3. e'nin indexlerini bulun...
        //2. e'yi bulabilmek icin 1. e'nin indexine ihtiyacim var

        int ilke=str1.indexOf("e");
        int ikincie=str1.indexOf("e",ilke+1);

        //Eger 2. e varsa 3. e'nin olup olmadigini ve varsa index ini yazdiralim

        if (ikincie==-1){
            System.out.println("verilen str1 de ikinci e yok");

        }else {
            int ucuncue=str1.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("str1 de ucuncu e yoktur");

            }else {
                System.out.println("verilen str1'deki 3. e'nin indexi: "+ucuncue);
            }



        }

    }
}
