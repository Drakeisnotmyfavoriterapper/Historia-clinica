import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {
    private String id;
    private Date birthdate;
    private String name;
    private String lastName;
    private double weight;
    private double height;
    private boolean sex;
    private String address;
    private List<Image> images;
    private List<Disease> diseases;

    public Patient() {
        this.images = new ArrayList<>();
        this.diseases = new ArrayList<>();
    }

    public Patient(String id, String name, String lastName, Date birthdate, boolean sex, double weight, double height, String address) {
        this.id = id;
        this.birthdate = birthdate;
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.address = address;
        this.images = new ArrayList<>();
        this.diseases = new ArrayList<>();
    }

    public String ObtainId() {
        return id;
    }
    public Date ObtainBirthDate() {
        return birthdate;
    }
    public String ObtainName() {
        return name;
    }
    public String ObtainLastName() {
        return lastName;
    }
    public double ObtainWeight() {
        return weight;
    }
    public double ObtainHeight() {
        return height;
    }

    public boolean ObtainSex() {
        return sex;
    }

    public String ObtainAddress() {
        return address;
    }
    public List<Image> ObtainImages() {
        return images;
    }
    public List<Disease> ObtainDiseases() {
        return diseases;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void addDisease(Disease disease) {
        diseases.add(disease);
    }
    public void deleteDisease(Disease disease) {
        diseases.remove(disease);
    }
    public void addImage(Image image) {
        images.add(image);
    }
    public void deleteImage(Image image) {
        images.remove(image);
    }

}