package practise.classesAndObjects;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Dark tower", "Stephen King", 2340);
        Book book2 = new Book("The Knights of the Cross ", "Henryk Sienkiewicz", 568);


        System.out.println(book1.getBook());
        System.out.println(book2.getBook());


    }

}


