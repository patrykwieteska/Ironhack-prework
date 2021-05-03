package practise.composition;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ComputerTower computerTower = new ComputerTower(123,new Date(),999.90,"INTEL",512);
        Monitor monitor = new Monitor(234,new Date(),250.50,27,"1920x1080");
        Keyboard keyboard = new Keyboard(89,new Date(),40.00,true,"QWERTY");

        Desktop desktop1 = new Desktop("Best Computer",computerTower,monitor,keyboard);

        System.out.println("Desktop '"+desktop1.getName()+"' costs only "+ desktop1.getPrice()+" USD. The price included:" +
                "\nComputer tower: "+desktop1.getComputerTower().getPrice() + " USD (Hard drive " + desktop1.getComputerTower().getHardDriveCapacityGb() + "GB, Processor:" + desktop1.getComputerTower().getProcessorModel() +
                ")\nMonitor "+desktop1.getMonitor().getPrice() + " USD (Monitor size: " + desktop1.getMonitor().getMonitorSize() + " inches, Max resolution: " + desktop1.getMonitor().getMaxResolution() +
                ")\nKeyboard "+desktop1.getKeyboard().getPrice() + " USD (Keyboard layout: " + desktop1.getKeyboard().getKeyboardLayout()+")");
    }



}
