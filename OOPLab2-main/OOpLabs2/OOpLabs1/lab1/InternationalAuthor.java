package lab1;

import java.util.Date;

class InternationalAuthor extends Author {
    private String nationality;
    private String language;

    public InternationalAuthor(String name, String surname, Date birthdate, String nationality, String language) {
        super(name, surname, birthdate);
        this.nationality = nationality;
        this.language = language;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nationality: " + nationality + ", Language: " + language;
    }
}
