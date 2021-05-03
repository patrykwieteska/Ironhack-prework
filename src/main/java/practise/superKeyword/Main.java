package practise.superKeyword;

public class Main {
    public static void main(String[] args) {
        Person person   =new Person("John", 31);
        Employee employee = new Employee("Lukas", 32, "CEO");

        person.sayHi();
        employee.sayHi();
    }
}
