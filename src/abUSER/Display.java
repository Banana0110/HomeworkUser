package abUSER;

public class Display {
    private int size;
    private String Manufacturer;
    private String color;

    public Display(int size, String Manufacturer, String color) {
        this.size = size;
        this.Manufacturer = Manufacturer;
        this.color = color;


    }

    @Override
    public String toString() {
        return "Display{" +
                "size=" + size +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Display() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
