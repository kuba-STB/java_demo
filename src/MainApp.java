import model.Computer.Computer;
import model.Computer.Laptop;
import model.Computer.PC;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office PC 1", "Acer", 500, 16, false);
        Computer officeComputer2 = new PC("Office PC 2", "Acer", 1000, 16, false);
        Computer businessLaptop1 = new Laptop("Business 1", "Dell", 128, 8, 80);
        Computer businessLaptop2 = new Laptop("Business 2", "Dell", 256, 8, 50);
        Computer businessLaptop3 = new Laptop("Business 3", "Dell", 512, 16, 30);

        System.out.println(businessLaptop1.volumeUp(23));
        System.out.println(businessLaptop1.volumeUp(52));
        System.out.println(businessLaptop1.volumeUp(34));

        System.out.println(businessLaptop1.volumeUp());
        System.out.println(businessLaptop1.volumeDown());
        System.out.println(businessLaptop1.volumeDown());

//        Computer[] computers = {officeComputer1, officeComputer2, businessLaptop1, businessLaptop2, businessLaptop3};
//        for (Computer computer : computers) {
//            computer.switchOff();
//        }
//
//        ((PC)officeComputer1).showComputerName();

    }
}
