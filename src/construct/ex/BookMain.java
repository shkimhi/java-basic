package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Helllo", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA","kim", 700);
        book3.displayInfo();

    }
}
