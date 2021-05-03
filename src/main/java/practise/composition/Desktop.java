package practise.composition;

import java.util.Collections;

public class Desktop {

    String name;
    private ComputerTower computerTower;
    private Monitor monitor;
    private Keyboard keyboard;

    public Desktop(String name,ComputerTower computerTower, Monitor monitor, Keyboard keyboard) {
        this.setName(name);
        this.setComputerTower(computerTower);
        this.setMonitor(monitor);
        this.setKeyboard(keyboard);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComputerTower getComputerTower() {
        return computerTower;
    }

    public void setComputerTower(ComputerTower computerTower) {
        this.computerTower = computerTower;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getPrice() {
        return this.computerTower.getPrice() + this.monitor.getPrice() + this.keyboard.getPrice();
    }
}
