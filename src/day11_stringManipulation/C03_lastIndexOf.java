package day11_stringManipulation;

public class C03_lastIndexOf {

    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";
        /*
        Verilen kelime icin asaagidaki sartlardan uygun olani yazan bir program yazin
        - verilen kelime cumlede kullanilmamis
        - sadece 1 kere kullanilmis
        - birden fazla kez kullanilmis.
         */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("kelime cumlede kullanilmamis");

        }else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("kelime 1 kere kullanilmis");

        }else {
            System.out.println("verilen kelime birden fazla kullanilmis");
        }




    }
}
