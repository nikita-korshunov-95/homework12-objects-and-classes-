public class Book {
    private String bookTitle;
    private Author nameOfAuthor;
    private int publicationYear;
    public Book (String bookTitle, Author nameOfAuthor, int publucationYear) {
        this.bookTitle = bookTitle;
        this.nameOfAuthor = nameOfAuthor;
        this.publicationYear = publucationYear;
    }
    public String getBookTitle () {
        return this.bookTitle;
    }
    public Author getNameOfAuthor () {
        return this.nameOfAuthor;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
