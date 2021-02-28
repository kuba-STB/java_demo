package model.Computer;

public class PC extends Computer {

    private boolean isPluggedIn;

    public PC(String name, String type, int hdd, int ram, boolean isPluggedIn) {
        super(name, type, hdd, ram);
        this.isPluggedIn = isPluggedIn;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        volumeLevel += 1;
        if (volumeLevel > 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeUp(int addedVolume) {
        volumeLevel += addedVolume;
        if (volumeLevel > 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int subtractedVolume) {
        volumeLevel -= subtractedVolume;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
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

    public void switchOff() {
        System.out.println("Switching off PC: " + name);
        this.state = false;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.isPluggedIn = pluggedIn;
    }
}