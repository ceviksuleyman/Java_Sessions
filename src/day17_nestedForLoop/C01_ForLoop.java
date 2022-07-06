package day17_nestedForLoop;

public class C01_ForLoop {

    public static void main(String[] args) {
        /*
        verilen String'deki kullanilan harfleri tekrarsiz olarak yazdirip kelimede kullanilan farkli
        harf sayisini veren bir method olusturun...
         */

        String input="Java her zaman guzel";

        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String bensersizInput="";

        String islenecekKelime=input.replaceAll("\\W",""); //Javaherzamanguzel
        System.out.print(islenecekKelime.substring(0,1)); //J ilk harfi aldik ve bunu benzersiz inputa ekliyoruz
        bensersizInput+=islenecekKelime.substring(0,1);//J

        for (int i = 0; i <islenecekKelime.length() ; i++) {   //<= dersek length-1 olur < dersek length olur

            if (!bensersizInput.contains(islenecekKelime.substring(i,i+1))){  //harfi icermiyorsa

                System.out.print(", "+islenecekKelime.substring(i,i+1));
                bensersizInput+=islenecekKelime.substring(i,i+1);

            }

        }
        System.out.println("");
        System.out.println("input: "+input);
        System.out.println("benzersiz input: "+bensersizInput);
        System.out.println("harf sayisi: "+ bensersizInput.length());

    }
}
