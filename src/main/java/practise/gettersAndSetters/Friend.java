package practise.gettersAndSetters;

public class Friend {
    private String firstName;
    private String surname;
    private boolean isOnline;
    private int age;


    public Friend(String firstName, String surname, boolean isOnline, int age) {
        setAge(age);
        setFirstName(firstName);
        setOnline(isOnline);
        setSurname(surname);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
