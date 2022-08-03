package day32_stringBuilder;

public class C04_subSequence_setCharAt {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0, 3); // substring string olarak calistigi icin immutable ve sadece bu satirda kaldi
                            // Bu method String dondurdugu icin StringBuilder'in eski halini degistiremez

        System.out.println("sb = " + sb);// Kayra


        sb.subSequence(0, 3);

        System.out.println("sb = " + sb);// Kayra


        sb.setCharAt(4, 'u');

        System.out.println("sb = " + sb);// Kayru
    }
}
