package practise.constructors;

import java.util.Date;

public class Car {

    private String model;
    private int vin;
    private boolean forSale;
    private Date productionDate;

    public Car(String model,int vin) {
        setModel(model);
        setVin(vin);
        this.forSale=true;
    }
    public Car(String model, boolean forSale, Date productionDate, int vin) {
        setModel(model);
        setForSale(forSale);
        setProductionDate(productionDate);
        setVin(vin);
    }
    public Car(int vin) {
        setVin(vin);
        this.model="unknown";
        this.forSale=true;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
}
