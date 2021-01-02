public class MainApp {

    public static void main(String[] args) {

        int pierwsza = 131;
        int druga = 9;
        int trzecia = 22;
        int czwarta = 47;
        int suma1 = pierwsza + druga;
        int suma2 = trzecia + czwarta;


        if(suma1 % 2 == 0){
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");}

        if(suma2 % 2 == 0){
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");}

        if (suma1 % 2 == 0 && suma2 % 2 == 0) {
            System.out.println("obie sumy są parzyste");
        } else {
            System.out.println("jedna suma jest nieparzysta");
        }


    }};
