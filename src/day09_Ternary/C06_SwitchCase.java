package day09_Ternary;


public class C06_SwitchCase {

    public static void main(String[] args) {

        //Kullanicidan gun ismini alin haftaici veya haftasonu oldugunu yazdirin..

        String input="pazar";
        input=input.toLowerCase();


        switch (input){
            case"pazartesi":
                System.out.println("Haftaici");
                break;
            case"sali":
                System.out.println("Haftaici");
                break;
            case "carsamba":
                System.out.println("Haftaici");
                break;
            case "persembe":
                System.out.println("Haftaici");
                break;
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
                System.out.println("Haftasonu");
                break;
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecerli bir gun girin..");
        }

        switch (input){
            case"pazartesi":
            case"sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecerli bir gun girin..");
        }



    }
}
