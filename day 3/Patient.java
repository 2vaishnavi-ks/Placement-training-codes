import java.io.Serializable;

public class Patient implements Serializable{ //called pojo/entity
    private String name;
    private int age;
    private String gender;
    private double weight, height, bmi;
    public String getName() {  //right click on the page, click on soruce action , and then click on , generte setters and getters 
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", bmi=" + bmi + "]";
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getBmi() {
        return bmi;
    }
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    
}