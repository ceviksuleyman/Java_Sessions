package day40_final_Abstract;

public class D_ChildOfAbstract extends C_Abstract{


    @Override
    void carpma() {
        /*
        Abstract class'lar child class'larin sahip olmalari gereken mecburi
        ozellikleri belirlerler.
        (Gunluk hayatimizdaki standartlar gibi)

        Abstract bir class'i parent edinen tum child'lar parent abstract
        class'daki tum abstract method'lari override etmek zorundadirlar.
         */

    }

    @Override
    void bolme() {

    }

    public static void main(String[] args) {

        D_ChildOfAbstract obj = new D_ChildOfAbstract();
        obj.cikarma();
    }
}
