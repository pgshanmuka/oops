package oops;

import java.util.Scanner;

public class Library {
	private String bookName;
    private String authorName;
    private int numCopies;

    //constructor
    public Library(String bookName, String authorName, int numCopies) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numCopies = numCopies;
    }

    //getters and setters
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    //method to borrow a book
    public void borrowBook() {
        if (numCopies > 0) {
            System.out.println("Book borrowed successfully");
            numCopies--;
        } else {
            System.out.println("Book not available");
        }
    }

    //method to return a book
    public void returnBook() {
        numCopies++;
        System.out.println("Book returned successfully");
    }

    public static void main(String[] args) {
        //Create list of 10 books
        Library book1 = new Library("The Catcher in the Rye", "J. D. Salinger", 2);
        Library book2 = new Library("To Kill a Mockingbird", "Harper Lee", 3);
        Library book3 = new Library("The Great Gatsby", "F. Scott Fitzgerald", 1);
        Library book4 = new Library("The Grapes of Wrath", "John Steinbeck", 4);
        Library book5 = new Library("Animal Farm", "George Orwell", 2);
        Library book6 = new Library("Lord of the Flies", "William Golding", 3);
        Library book7 = new Library("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1);
        Library book8 = new Library("The Lord of the Rings", "J.R.R. Tolkien", 4);
        Library book9 = new Library("1984", "George Orwell", 2);
        Library book10 = new Library("The Cat in the Hat", "Dr. Seuss", 3);

        //Allow the user to borrow and return books
        System.out.println("Enter the book name you want to borrow: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        switch (bookName) {
            case "The Catcher in the Rye":
                book1.borrowBook();
                break;
            case "To Kill a Mockingbird":
                book2.borrowBook();
                break;
            case "The Great Gatsby":
                book3.borrowBook();
                break;
            case "The Grapes of Wrath":
                book4.borrowBook();
                break;
            case "Animal Farm":
                book5.borrowBook();
                break;
            case "Lord of the Flies":
                book6.borrowBook();
                break;
            case "The Hitchhiker's Guide to the Galaxy":
                book7.borrowBook();
                break;
            case "The Lord of the Rings":
                book8.borrowBook();
                break;
            case "1984":
                book9.borrowBook();
                break;
            case "The Cat in the Hat":
                book10.borrowBook();
                break;
            default:
                System.out.println("Book not found");
        }

        //return book
        System.out.println("Enter the book name you want to return: ");
        String returnBookName = scanner.nextLine();
        switch (returnBookName) {
            case "The Catcher in the Rye":
                book1.returnBook();
                break;
            case "To Kill a Mockingbird":
                book2.returnBook();
                break;
            case "The Great Gatsby":
                book3.returnBook();
                break;
            case "The Grapes of Wrath":
                book4.returnBook();
                break;
            case "Animal Farm":
                book5.returnBook();
                break;
            case "Lord of the Flies":
                book6.returnBook();
                break;
            case "The Hitchhiker's Guide to the Galaxy":
                book7.returnBook();
                break;
            case "The Lord of the Rings":
                book8.returnBook();
                break;
            case "1984":
                book9.returnBook();
                break;
            case "The Cat in the Hat":
                book10.returnBook();
                break;
            default:
                System.out.println("Book not found");
        }
    }
}


