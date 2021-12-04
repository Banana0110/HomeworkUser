package abUSER;

public class UsbPort {
    private String TypePort;
    private String ID;


    @Override
    public String toString() {
        return "UsbPort{" +
                "TypePort='" + TypePort + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public String getTypePort() {
        return TypePort;
    }

    public void setTypePort(String typePort) {
        TypePort = typePort;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public UsbPort(String TypePort, String ID) {
        this.TypePort = TypePort;
        this.ID = ID;


    }
}
