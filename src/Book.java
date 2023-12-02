public class Book {
    private String bookTitle;
    private Author author;
    private int publicationYear;
    public Book (String bookTitle, Author author, int publucationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publucationYear;
    }
    public String getBookTitle () {
        return this.bookTitle;
    }
    public Author getAuthor () {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
