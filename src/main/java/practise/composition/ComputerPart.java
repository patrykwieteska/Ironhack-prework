package practise.composition;

import java.util.Date;

public class ComputerPart {
    private int modelNumber;
    private Date productionDate;
    private double price;

    public ComputerPart(int modelNumber, double price) {
        this.setModelNumber(modelNumber);
        this.setProductionDate(new Date());
        this.setPrice(price);
    }

    public ComputerPart(int modelNumber, Date productionDate, double price) {
        this.setModelNumber(modelNumber);
        this.setProductionDate(productionDate);
        this.setPrice(price);
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
