package lab1;

import java.util.Date;

class Publication {
    private String title;
    private BookGenre genre;
    private Date publishDate;

    public Publication(String title, BookGenre genre, Date publishDate) {
        this.title = title;
        this.genre = genre;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Publication: " + title + ", Genre: " + genre + ", Published on: " + publishDate;
    }
}
