public class Book {

    private String bookId;
    private String title;
    private String author;
    private String category;
    private int stock;
    private int duration;

    public Book(String bookId, String title, String author, int stock){
        this.bookId   = bookId;
        this.title    = title;
        this.author   = author;
        this.stock    = stock;

    }
    public void setBookId(String bookId){
        this.bookId     = bookId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }



    public String getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getCategory(){
        return category;
    }
    public int getStock(){
        return stock;
    }
    public int getDuration(){
        return duration;
    }


}
