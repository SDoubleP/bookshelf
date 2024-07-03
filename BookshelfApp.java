
public class BookshelfApp {
    ArrayList<Book> book = new ArrayList<>();

    public ArrayList<Book> displayBookinfo(){
        return book;
    }

    public void addBook(Book newBook){
        book.add(newBook);
    }

    public void removeBook(String bookID){
        
        try{
        for(Book id : book){
            if (id.getBookID().equals(bookID)) {
                book.remove(id);   
            }
        }
        }catch(ConcurrentModificationException a){

        }
    }

    public Book searchbookbyID(String bookID){

        for(Book id : book){
            if (id.getBookID().equals(bookID)) {
                return id;
            }
        }
        return null;
    }

    public void updatebyID (String bookID,String bookName,String author, String genre){
        for(Book id : book){
            if (id.getBookID().equals(bookID)) {
                id.setBookName(bookName);
                id.setAuthor(author);
                id.setGenre(genre);
            }
        }

    }

}

