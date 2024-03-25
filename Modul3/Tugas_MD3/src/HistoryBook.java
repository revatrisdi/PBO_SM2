public class HistoryBook extends Book{
    private String category;

    public HistoryBook(String bookId, String title, String author,int stock){
        super(bookId, title, author,stock);

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
