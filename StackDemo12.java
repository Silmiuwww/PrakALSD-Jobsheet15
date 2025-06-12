import java.util.Stack;
public class StackDemo12 {
    public static void main(String[] args) {
        Book12 book1 = new Book12("1234", "Dasar Pemrograman");
        Book12 book2 = new Book12("7145", "Hafalah Shalat Delisa");
        Book12 book3 = new Book12("3562", "Muhammad Al-Fatih");

        Stack<Book12> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book12 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book12 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book12 book : books) {
            System.out.println(book.toString());
        }

        System.out.println(books);
    }
}
