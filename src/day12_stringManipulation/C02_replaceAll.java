package day12_stringManipulation;

public class C02_replaceAll {

    public static void main(String[] args) {
        /*Regular Expressions

        \\s : bosluk(space)
        \\S : bosluk disindaki tum karakterler
        \\w : harfler ve rakamlar
        \\W : harfler ve rakamlar disindaki tum karakterler
        \\d : rakamlar
        \\D : rakamlar disindaki tum karakterler
         */
        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        //str'i "Bugun Java cok guzel" haline getir
        //replaceAll() deki All un amaci ayni ozellikteki tum karakterleri kapsamasidir...
        //butun sayilari sil
        //butun ozel karakterleri sil


        //tum ozel karakterleri silelim dedigimizde space'lerde siliniyor,space'leri korumak icin
        //en basta onlarin yerine cumlede bulunmayacak bir String koyalim
        //"qwert"

        str=str.replace(" ","qwert");

        str=str.replaceAll("\\W","");
        System.out.println(str);//1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");//istenmyen ozel karakter ve sayilardan kurtulduk simdi
                                                   //space'leri geri getirelim
        str=str.replace("qwert"," ");

        System.out.println(str);










    }
}
