public class Main {
    public static void main(String[] args) {
        Author johnTolkien = new Author ("John", " Tolkien");

        Author levTolstoy = new Author("Lev", " Tolstoy");

        Book lordOfTheRings = new Book("Lord of the Rings", johnTolkien, 1954);
        System.out.println(lordOfTheRings.getBookTitle());
        System.out.println(lordOfTheRings.getAuthor().getNameAuthor() + "" + lordOfTheRings.getAuthor().getSurnameAuthor());
        System.out.println(lordOfTheRings.getPublicationYear());

        lordOfTheRings.setPublicationYear(1955);
        System.out.println(lordOfTheRings.getPublicationYear());

        Book warAndPeace = new Book ("War and Peace", levTolstoy, 1869);
        System.out.println(warAndPeace.getBookTitle());
        System.out.println(warAndPeace.getAuthor().getNameAuthor() + "" + warAndPeace.getAuthor().getSurnameAuthor());
        System.out.println(warAndPeace.getPublicationYear());
    }
}