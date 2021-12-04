package abUSER;

public class Ram {
    private int size;
    private String Madein;


    @Override
    public String toString() {
        return "Ram{" +
                "size=" + size +
                ", Madein='" + Madein + '\'' +
                '}';
    }

    public Ram(int size, String Madein) {
        this.size = size;
        this.Madein = Madein;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMadein() {
        return Madein;
    }

    public void setMadein(String madein) {
        Madein = madein;
    }
}
