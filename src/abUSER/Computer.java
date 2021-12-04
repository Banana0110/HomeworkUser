package abUSER;

public class Computer {
    private Display display;
    private String manufacture;
    private HardDisk hardDisk;
    private Ram ram;
    private UsbPort usbPort;
    private Keyboard keyboard;

    public Computer(Display display) {
        this.display = getDisplay();
        this.manufacture = getManufacture();
        this.hardDisk = getHardDisk();
    }


    @Override
    public String toString() {
        return "Computer{" +
                "display=" + display +
                ", manufacture='" + manufacture + '\'' +
                ", hardDisk=" + hardDisk +
                ", ram=" + ram +
                ", usbPort=" + usbPort +
                ", keyboard=" + keyboard +
                '}';
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public UsbPort getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(UsbPort usbPort) {
        this.usbPort = usbPort;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
