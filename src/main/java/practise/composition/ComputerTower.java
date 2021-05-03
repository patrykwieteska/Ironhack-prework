package practise.composition;

import java.util.Date;

public class ComputerTower extends ComputerPart {

    private String processorModel;
    private int hardDriveCapacityGb;

    public ComputerTower(int model, Date productionDate, double price, String processorModel, int hardDriveCapacityGb) {
        super(model,productionDate, price);
        this.setProcessorModel(processorModel);
        this.setHardDriveCapacityGb(hardDriveCapacityGb);

    }


    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public int getHardDriveCapacityGb() {
        return hardDriveCapacityGb;
    }

    public void setHardDriveCapacityGb(int hardDriveCapacityGb) {
        this.hardDriveCapacityGb = hardDriveCapacityGb;
    }
}
