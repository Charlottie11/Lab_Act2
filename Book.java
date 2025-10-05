
public class Book {
    // 6.1) Create an array of Book objects to store all the books you created. 
    public static Book[] books = {
        new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, 0),
        new Book("The Power of Habit", "Charles Duhigg", 2012, 0),
        new Book("Atomic Habits", "James Clear", 2018, 0),
        new Book("Java Programming", "John Doe", 2020, 0),
        new Book("Tensura", "Fuse", 2013, 0)
    };
    // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
    public String title;
    public String author;
    public int yearPublished;
    public int currentPage;

    public Book(String title, String author, int yearPublished, int currentPage) {
        
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = currentPage;
    }
}