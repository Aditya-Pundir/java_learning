package com.company;

class library{
    String[] books;
    int no_of_books;

    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        System.out.println();
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println();
        System.out.println("The available books are: ");
        for (String book:this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " +book);
        }
    }

    void issueBook(String book){
        System.out.println();
            for (int i = 0; i < this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    System.out.println("The book has been issued!");
                    this.books[i] = null;
                    return;
                }
            }
        System.out.println("This book is not available!");
    }

    void returnBook(String book){
        addBook(book);
    }
}
public class exercise_4_solution_by_Harry {
    public static void main(String[] args) {
        library centralLibrary = new library();
        centralLibrary.addBook("Java");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Algorithms");
        centralLibrary.issueBook("C++");
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
