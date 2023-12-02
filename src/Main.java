public class Main {
    public static void main(String[] args) {
        Author johnTolkien = new Author ("John", " Tolkien");
        System.out.println(johnTolkien.getNameAuthor() + johnTolkien.getSurnameAuthor());

        Author levTolstoy = new Author("Lev", " Tolstoy");
        System.out.println(levTolstoy.getNameAuthor() + levTolstoy.getSurnameAuthor());

        Book lordOfTheRings = new Book("Lord of the Rings", johnTolkien, 1954);
        System.out.println(lordOfTheRings.getBookTitle());
        System.out.println(lordOfTheRings.getNameOfAuthor());
        System.out.println(lordOfTheRings.getPublicationYear());

        lordOfTheRings.setPublicationYear(1955);
        System.out.println(lordOfTheRings.getPublicationYear());

        Book warAndPeace = new Book ("War and Peace", levTolstoy, 1869);
        System.out.println(warAndPeace.getBookTitle());
        System.out.println(warAndPeace.getNameOfAuthor());
        System.out.println(warAndPeace.getPublicationYear());
    }
}