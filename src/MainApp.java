import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office PC", "Acer", 500, 16, false);
        Laptop businessLaptop = new Laptop("Business", "Dell", 128, 8, 80);


        businessLaptop.setBatteryLevel(0);
        businessLaptop.switchOn();
        System.out.println(businessLaptop.getState());

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.setPluggedIn(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
    }


}