package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {

    public static void main(String[] args) {
        // Array'i array yapan sembol [] di arrayList de ise <> diamond(elmas) kullaniriz

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler);// []

        //Bir List'e eleman eklemek istersek
        isimler.add("Suleyman");
        System.out.println(isimler.add("Murtaza"));// true
        /*
        String'de bir method calistirdigimizda assign yapmazsak String degismiyordu.
        String isim = "Suleyman";
        isim.toUpperCase(); sadece bu satir icin SULEYMAN
        Sout(isim) -> Suleyman
         */
        System.out.println(isimler);// [Suleyman, Murtaza]
        // List'in tek kotu tarafi array alt yapisini kullandigi icin elemanlari birer birer eklemek zorunda olmamizdir.

    }
}
