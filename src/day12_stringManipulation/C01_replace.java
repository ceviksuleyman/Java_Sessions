package day12_stringManipulation;

public class C01_replace {

    public static void main(String[] args) {

        String str=" Bu gun ha va cok guz el ";

        System.out.println(str.replace(" ",""));

        //hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));

        //guz el yerine harika yazalim

        System.out.println(str.replace("guz el","harika"));

        //cumleyi replace kullanarak Bugun Java cok guzel yapalim

        str=str.replace(" Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");

        System.out.println(str);










    }
}
