// 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
public class Book {
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