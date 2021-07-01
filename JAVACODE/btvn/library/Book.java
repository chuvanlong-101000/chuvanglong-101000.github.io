package btvn.library;

public class Book {
    
    @Override
    public String toString() {
        return "Book [Bookname=" + Bookname + ", Category=" + Category + ",Author=" + Author + ", id Book =" + id
                + ", producer=" + producer + "]";
    }

    private long id ;
    private String Bookname ;
    private String Category ;
    private String Author ;
    private String producer;

    public String getBookname() {
        return Bookname;
    }
    public void setBookname(String bookname) {
        Bookname = bookname;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public Book(String bookname, String category, String author, String producer) {
        id = IdGenerator.getNewIDBook();
        this.Bookname = bookname;
        this.Category = category;
        this.Author = author;
        this.producer = producer;
    }    
}
