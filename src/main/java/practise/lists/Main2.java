package practise.lists;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();

        contactList.add(new Contact("Michael", "+49 345 345 345"));
        contactList.add(new Contact("Ryszard", "+48 456 456 456"));
        contactList.add(new Contact("John", "+52 890 890 890"));

        for (int i = 0; i <contactList.size() ; i++) {
            System.out.println(contactList.get(i).getName() + ", phone: "+contactList.get(i).getPhone());
        }
    }
}
