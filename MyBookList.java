    // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
public class MyBookList{
    public static Book[] books = new Book[5];
    
    // 2.) Display the details of each book using the displayDetails method. Below is the sample output
        //     Title: Rich Dad Poor Dad, Author: Robert Kiyosaki, Year: 1997, Current Page: 0
        //     Title: The Power of Habit, Author: Charles Duhigg, Year: 2012, Current Page: 0
        //     Title: Atomic Habits, Author: James Clear, Year: 2018, Current Page: 0
        //     Title: Java Programming, Author: John Doe, Year: 2020, Current Page: 0
    public static void displayDetails() {
        System.out.println("\n---------------------");
        System.out.println("|    Books Lists    |");
        System.out.println("---------------------\n");
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nTitle: " + books[i].title
                    + ", Author: " + books[i].author
                    + ", Year: " + books[i].yearPublished
                    + ", Current Page: " + books[i].currentPage);
        }
    }
    // 3.) Change the current page of "Rich Dad Poor Dad" to 50 and "Atomic Habits" to 100 using the changePage method. Display the details again for the two books.
    public static void changePage() { 
        books[0].currentPage = 50;
        books[2].currentPage = 100;
        System.out.println("\n-------------------------");
        System.out.println("|    Updated Book/s     |");
        System.out.println("-------------------------\n");
        System.out.println("\nUPDATED PAGE FOR: \n");
        System.out.println("\nTitle: " + books[0].title
                + ", Author: " + books[0].author
                + ", Year: " + books[0].yearPublished
                + ", Current Page: " + books[0].currentPage);

        System.out.println("\nTitle: " + books[2].title
                + ", Author: " + books[2].author
                + ", Year: " + books[2].yearPublished
                + ", Current Page: " + books[2].currentPage);

    // 4.) Change the current page of your favorite book to any page number you like. Display the details again for your favorite book.
        books[4].currentPage = 11;
        System.out.println("\n-------------------------");
        System.out.println("|    Updated Book/s     |");
        System.out.println("-------------------------\n");
        System.out.println("\nUPDATED PAGE FOR: \n");
        System.out.println("\nTitle: " + books[4].title
                + ", Author: " + books[4].author
                + ", Year: " + books[4].yearPublished
                + ", Current Page: " + books[4].currentPage);
    }
    public static void main(String[] args) {
    //6.1)Create an array of Book objects to store all the books you created.
        books[0] = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, 0);
        books[1] = new Book("The Power of Habit", "Charles Duhigg", 2012, 0);
        books[2] = new Book("Atomic Habits", "James Clear", 2018, 0);
        books[3] = new Book("Java Programming", "John Doe", 2020, 0);
        books[4] = new Book("Tensura", "Fuse", 2013, 0);
        displayDetails();
        changePage();

    //5.) Change the author of "Java Programming" to "Jane Smith". Display the details again for the book.
        books[3].author = "Jane Smith";
        System.out.println("\n-------------------------");
        System.out.println("|    Updated Book/s     |");
        System.out.println("-------------------------\n");
        System.out.println("\nUPDATED AUTHOR FOR: \n");
        System.out.println("\nTitle: " + books[3].title
                + ", Author: " + books[3].author
                + ", Year: " + books[3].yearPublished
                + ", Current Page: " + books[3].currentPage);
            
    //6.2)Loop through the array and display the title of the books published after 2010.
        System.out.println("\n---------------------------------");
        System.out.println("|   Books publish after 2010:   |");
        System.out.println("---------------------------------\n");
        for (int i = 0; i < books.length; i++) {
            if (books[i].yearPublished > 2010) {
            System.out.println((i) + ") " + books[i].title + "\n");
            }
        }
    }   
}
