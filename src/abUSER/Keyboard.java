package abUSER;

import java.util.Arrays;

public class Keyboard {
    private int[] KeysOnKeyboard;
    private boolean isRGB;
    private boolean hasNumpad;


    @Override
    public String toString() {
        return "Keyboard{" +
                "KeysOnKeyboard=" + Arrays.toString(KeysOnKeyboard) +
                ", isRGB=" + isRGB +
                ", hasNumpad=" + hasNumpad +
                '}';
    }

    public int[] getKeysOnKeyboard() {
        return KeysOnKeyboard;
    }

    public void setKeysOnKeyboard(int[] keysOnKeyboard) {
        KeysOnKeyboard = keysOnKeyboard;
    }

    public boolean isRGB() {
        return isRGB;
    }

    public void setRGB(boolean RGB) {
        isRGB = RGB;
    }

    public boolean isHasNumpad() {
        return hasNumpad;
    }

    public void setHasNumpad(boolean hasNumpad) {
        this.hasNumpad = hasNumpad;
    }

    public Keyboard(int[] KeysOnKeyboard, boolean isRGB, boolean hasNumpad) {
        this.KeysOnKeyboard = KeysOnKeyboard;
        this.isRGB = isRGB;
        this.hasNumpad = hasNumpad;


    }
}
