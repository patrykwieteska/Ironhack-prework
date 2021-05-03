package practise.composition;

import java.util.Date;

public class Keyboard extends ComputerPart{

    private boolean isWireless;
    private String keyboardLayout;

    public Keyboard(int model, Date productionDate, double price, boolean isWireless, String keyboardLayout) {
        super(model, productionDate, price);
        this.setWireless(isWireless);
        this.setKeyboardLayout(keyboardLayout);
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public String getKeyboardLayout() {
        return keyboardLayout;
    }

    public void setKeyboardLayout(String keyboardLayout) {
        this.keyboardLayout = keyboardLayout;
    }
}
