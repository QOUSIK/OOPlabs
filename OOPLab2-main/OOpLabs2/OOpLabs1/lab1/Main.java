package lab1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Author basicAuthor = new Author("John", "Doe", new Date(80, 5, 15));
        InternationalAuthor internationalAuthor = new InternationalAuthor("Paulo", "Pablo", new Date(47, 7, 24), "Brazilian", "Portuguese");
        SelfPublishedAuthor selfPublishedAuthor = new SelfPublishedAuthor("Jonh", "Smith", new Date(90, 3, 12), "Amazon Kindle", "www.jonhsmith.com");


        Book basicBook = new Book("Fiction Adventures", BookGenre.FICTION, basicAuthor);
        basicBook.addPublication(new Publication("Short Story Collection", BookGenre.FICTION, new Date(119, 11, 1)));


        Book internationalBook = new Book("The Alchemist", BookGenre.FICTION, internationalAuthor);
        internationalBook.addPublication(new Publication("First Edition", BookGenre.FICTION, new Date(88, 4, 15)));


        Book selfPublishedBook = new Book("Indie Dreams", BookGenre.NON_FICTION, selfPublishedAuthor);
        selfPublishedBook.addPublication(new Publication("Self-Publishing Guide", BookGenre.NON_FICTION, new Date(122, 6, 5)));


        System.out.println(basicBook);
        System.out.println();
        System.out.println(internationalBook);
        System.out.println();
        System.out.println(selfPublishedBook);
    }
}