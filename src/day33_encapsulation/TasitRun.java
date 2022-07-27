package day33_encapsulation;

public class TasitRun {

    public static void main(String[] args) {

        Tasit tasit1 = new Tasit();

        tasit1.setTasitTuru("Tir");

        System.out.println("tasit1.getTasitTuru() = " + tasit1.getTasitTuru());//method call

        // Eger sadece setter methodu olusturulursa data degerleri degistirilebilir ama ilk atanan
        // deger veya bizim atadigimiz yeni deger baska class'lardan okunamaz.

    }
}
