public class Book {
    private String title;
    private Author author;
    private int publicationYear;
    public Book (String title, Author author, int publucationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publucationYear;
    }
    public String getTitle () {
        return this.title;
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
