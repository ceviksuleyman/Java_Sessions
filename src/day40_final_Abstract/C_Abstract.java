package day40_final_Abstract;

public abstract class  C_Abstract {

    void toplama(){

        System.out.println("Bu method toplama yapar");

    }

    abstract void carpma(); // abstract method

    abstract void bolme(); // abstract method

    void cikarma(){

        System.out.println("bu method cikarma yapar");
    }
    /*
    Bir method'un basina abstract yazarsaniz bu method'un child class'lar
    icin bir standart oldugunu declare etmis olursunuz ve method body'sine
    ihtiyac kalmaz.
     */
}
