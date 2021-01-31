package model.computer;

public class PC extends Computer {

    private boolean isPluggedIn;

    public PC(String name, String type, int hdd, int ram, boolean isPluggedIn) {
        super(name, type, hdd, ram);
        this.isPluggedIn = isPluggedIn;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPluggedIn) {
            super.switchOn();
        } else {
            System.out.println("PC not plugged in");
        }
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.isPluggedIn = pluggedIn;
    }
}

