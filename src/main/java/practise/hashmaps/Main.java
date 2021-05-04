package practise.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Miauer",7));
        pets.add(new Pet("Horus",3));
        pets.add(new Pet("Albert",2));
        pets.add(new Pet("Mr Bean",11));

        HashMap<String, Pet> ownersPets = new HashMap<>();

        ownersPets.put("firstOwner@gmail.com", pets.get(0));
        ownersPets.put("secondOwner@gmail.com", pets.get(1));
        ownersPets.put("thirdOwner@gmail.com", pets.get(2));
        ownersPets.put("fourthOwner@gmail.com", pets.get(3));

        for (Map.Entry<String, Pet> entry: ownersPets.entrySet()) {
            System.out.println(String.format("User %s is owner of pet called %s",entry.getKey(),entry.getValue().getName()));
        }
    }
}
