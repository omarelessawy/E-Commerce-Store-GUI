public class BookProduct extends Product{
    private String author;
    private String publisher;
    public BookProduct(int productId , String name , double price , String author , String publisher){
        super(productId , name , price);
        this.author = author;
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

}
