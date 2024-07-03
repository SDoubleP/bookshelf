public class Book {
    private String bookID;
    private String bookName;
    private String author;
    private String genre;

    public Book(String bookID, String bookName, String author, String genre) {
        setBookID(bookID);
        setBookName(bookName);
        setAuthor(author);
        setGenre(genre);
    }

    public String getBookID() {
        return bookID;
    }
    public void setBookID(String bookID) {
        if (bookID.length()>=3) {
            this.bookID = bookID;
        }else{
            System.out.println("Enter valid number");
        }
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\nBookList \n[BookID = " + bookID + ", \nBookName = " 
        + bookName + ", \nAuthor = " + author + ", \nGenre = " 
        + genre + "]";
    }

    
    
}
