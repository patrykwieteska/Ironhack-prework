package practise;

public class Methods1 {
    public static void main(String[] args) {
        String fullName = getFullName("John","Test");
        System.out.println(fullName);
    }

    private static String getFullName(String firstName, String lastName) {
        return firstName+" "+lastName;
    }
}