package practise.hashmaps;

public class Pet {

    String name;
    int age;

    public Pet(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("{\"Pet\":\"%s\",\"Age\":%o}",getName(),getAge());
    }
}
