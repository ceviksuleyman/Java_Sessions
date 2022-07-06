package day12_stringManipulation;

public class C08_StringManipulation {

    public static void main(String[] args) {

        // String method'larini kullanarak " Java ogrenmek123 Cok guzel@ " String'ini
        //"Java ogrenmek cok guzel." seklinde yazdirin..

        String str=" Java ogrenmek123 Cok guzel@ ";

        str=str.trim();//Java ogrenmek123 Cok guzel@

        str=str.replaceAll("\\d","");//Java ogrenmek Cok guzel@

        str=str.replace("@",".");//Java ogrenmek Cok guzel.

        str=str.replace("C","c");//Java ogrenmek cok guzel.

        System.out.println(str);



    }
}
