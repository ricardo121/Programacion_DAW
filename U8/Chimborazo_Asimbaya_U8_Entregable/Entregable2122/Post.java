package Entregable2122;

public class Post {


    private String title;
    private String link;
    private String description;
    private String pubdate;
    private static String guid;



    public Post(String title, String link, String description, String pubdate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubdate = pubdate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public static String getGuid() {
        return guid;
    }

    public static void setGuid(String guid) {
        Post.guid = guid;
    }


    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubdate='" + pubdate + '\'' +
                '}';
    }


}
