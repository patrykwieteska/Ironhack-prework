package practise.composition;

import java.util.Date;

public class Monitor extends ComputerPart {

    private int monitorSize;
    private String maxResolution;

    public Monitor(int model, Date productionDate, double price, int monitorSize, String maxResolution) {
        super(model, productionDate, price);
        this.setMonitorSize(monitorSize);
        this.setMaxResolution(maxResolution);
    }

    public int getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(int monitorSize) {
        this.monitorSize = monitorSize;
    }

    public String getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(String maxResolution) {
        this.maxResolution = maxResolution;
    }
}
