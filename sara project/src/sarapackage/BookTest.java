package sarapackage;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("la vie est belle", "01", "sara", "media");
        Book book2 = new Book("l'espoir", "02", "Jane", "media");
        Book book3 = new Book("la vie en rose", "03", "Dorin", "media");
        Book book4 = new Book("la belle et la bete", "04", "abdell", "media");
        Book book5 = new Book("A toi ", "05", "vicay", "media");

        System.out.println("Book 1:\n" + book1.getBookInfo());
        System.out.println("\nBook 2:\n" + book2.getBookInfo());
        System.out.println("\nBook 3:\n" + book3.getBookInfo());
        System.out.println("\nBook 4:\n" + book4.getBookInfo());
        System.out.println("\nBook 5:\n" + book5.getBookInfo());
    }
}