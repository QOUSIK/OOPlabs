package lab1;
import java.util.Date;

class SelfPublishedAuthor extends Author {
    private String platform;
    private String website;

    public SelfPublishedAuthor(String name, String surname, Date birthdate, String platform, String website) {
        super(name, surname, birthdate);
        this.platform = platform;
        this.website = website;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return super.toString() + ", Platform: " + platform + ", Website: " + website;
    }
}

