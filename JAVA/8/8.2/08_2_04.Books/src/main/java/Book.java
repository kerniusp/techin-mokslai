public class Book {

    private String bookTitle;
    private int pages;
    private int publicationYear;

    public Book(String bookTitle, int pages, int publicationYear){
        this.bookTitle = bookTitle;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return bookTitle + ", " + pages + ", " + publicationYear;
    }
}
