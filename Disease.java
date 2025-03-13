import java.util.Date;

public class Disease {
    private String name;
    private String treatment;
    private Date date;

    public Disease() {}

    public Disease(String name, Date date, String treatment) {
        this.name = name;
        this.treatment = treatment;
        this.date = date;
    }

    public String ObtainName() {
        return name;
    }
    public String ObtainTreatment() {
        return treatment;
    }
    public Date ObtainDate() {
        return date;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
