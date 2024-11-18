package lab1;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private BookGenre genre;
    private Author author;
    private List<Publication> publications;

    public Book(String title, BookGenre genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publications = new ArrayList<>();
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Genre: " + genre + ", Author: " + author + "\nPublications: " + publications;
    }
}

