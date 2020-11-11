package com.company;

class Library {

    private String[] arr; // Array to store the available books
    private String[] issuedBooks; // Array to store the issued books
    private String[] returnedBooks; // Array to store the returned books

    public void addBook(String ...bookNames) {
        arr = bookNames;
    }
    public void showAvailableBooks(){
        System.out.println("The available books are:");
        for (String a : arr) {
            System.out.println(a);
        }
    }
    public void issueBook(String... bookName){
        System.out.print("\n");
        for (String a : arr) {
            for (String e:bookName) {
                issuedBooks = bookName;
                if (e.equals(a)) {
                    if (issuedBooks.length == 1) {
                        System.out.println("Congratulations, the book is issued to you!");
                    }
                    else if (issuedBooks.length > 1){
                        System.out.println("Congratulations, the books are issued to you!");
                    }
                    return;
                }
            }
        }
        System.out.println("Sorry, the book isn't available!");
    }
    public void returnBooks(String... nameOfBooksToBeReturned){
        returnedBooks = nameOfBooksToBeReturned;

        if (returnedBooks.length == 1){
            System.out.println("Thanks for returning the book!");
        }
        else if (returnedBooks.length > 1){
            System.out.println("Thanks for returning the books!");
        }

    }
}
public class Exercise_4 {

    public static void main(String[] args) {

        Library myLibrary = new Library();
        myLibrary.addBook("English","Mathematics","Physics","Chemistry");
        myLibrary.showAvailableBooks();
        myLibrary.issueBook("English", "Math");
        myLibrary.returnBooks("English", "Maths");
    }
}
