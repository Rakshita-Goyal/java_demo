package CollectionProject;

import java.util.*;
 class Book {
    private int id;
    private String title;
    private boolean isIssued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Issued: " + isIssued;
    }
}
class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Integer, String> issuedBooks = new HashMap<>();

public void addBook(int id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added successfully!");
    }

     public void showBooks() {
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


 public void searchBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Book not found!");
    }


     public void issueBook(int id, String user) {
        for (Book b : books) {
            if (b.getId() == id && !b.isIssued()) {
                b.issueBook();
                issuedBooks.put(id, user);
                System.out.println("Book issued to " + user);
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && b.isIssued()) {
                b.returnBook();
                issuedBooks.remove(id);
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Invalid book ID!");
    }

}
public class Main{
    public static void main(String args[]){
 Library lib = new Library();
        Scanner sc = new Scanner(System.in);


 while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    lib.addBook(id, title);
                    break;

                case 2:
                    lib.showBooks();
                    break;

                case 3:
                    System.out.print("Enter book id: ");
                    lib.searchBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter book id: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter user name: ");
                    String user = sc.nextLine();
                    lib.issueBook(bid, user);
                    break;

                case 5:
                    System.out.print("Enter book id: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
 }
    }
}