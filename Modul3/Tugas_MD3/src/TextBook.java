public class TextBook extends Book{
    private String category;

    public TextBook(String bookId, String title, String author,int stock){
        super(bookId, title, author, stock);

    }
    @Override
    public void setCategory(String category){
        this.category = category;
    }

    @Override
    public String getCategory(){
        return category;
    }
}