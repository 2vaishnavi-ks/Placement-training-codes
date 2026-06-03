//example of encapsulation feature
class Patient{ //called pojo/entity
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
public class HealthMatrix2 {
    //function to calculate the body age from age and bmi
    public static void calculate(int age, double bmi){
        System.out.println("Body Age : ");
        if(bmi<18.5)    System.out.println(age+2);
        else if(bmi>25) System.out.println(age+5);
        else System.out.println(age);
    }

    //function to calculate the fat rate from the bmi which is calculated, the age and gender
    public static void calculate(double bmi, int age, String gender) {
        
        System.out.println("Fat rate is :");
        if(gender.equals("male"))
            System.out.println((1.20*bmi)+(0.23*age)-16.2);
        else
            System.out.println((1.20*bmi)+(0.23*age)-5.4);
    }

    //function which calls the other two function and calculates bmi
    public static void calculate(Patient object){
        System.out.println();
        System.out.println(object.getName()+" BMI report ");
        object.setHeight(object.getHeight() /100);
        object.setBmi(object.getWeight()/(object.getHeight()*object.getHeight()));

        System.out.println("BMI is : "+object.getHeight());
        calculate(object.getAge(), object.getBmi());
        calculate(object.getBmi(),object.getAge(), object.getGender());
    }
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setName("A");
        p1.setAge(25);
        p1.setGender("male");
        p1.setWeight(70.4);
        p1.setHeight(163);

        Patient p2 = new Patient();
        p2.setName("Shalini");
        p2.setAge(20);
        p2.setGender("female");
        p2.setWeight(68);
        p2.setHeight(165);

        calculate(p1);
        calculate(p2);
    }
}

