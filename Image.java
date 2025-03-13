import java.util.Date;
import java.util.List;

public class Image {
    private String name;
    private Date date;
    private String comments;
    private String type;

    public Image(){}

    public Image(String name, Date date, String type, String comments) {
        this.name = name;
        this.date = date;
        this.comments = comments;
        this.type = type;
    }

    public String ObtainName() {
        return name;
    }
    public Date ObtainDate() {
        return date;
    }
    public String ObtainComments() {
        return comments;
    }
    public String ObtainType() {
        return type;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setType(String type) {
        this.type = type;
    }

}