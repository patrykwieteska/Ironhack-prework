package practise.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();

        carBrands.add("Audi");
        carBrands.add("Volkswagen");
        carBrands.add("Porsche");
        carBrands.add("Lamborghini");

        for (String car: carBrands) {
            System.out.println(car);
        }

        carBrands.remove(2);

        for (String car: carBrands) {
            System.out.println(car);
        }
    }
}
