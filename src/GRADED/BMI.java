package GRADED;

public class BMI {

    // Attributes
    private String name;
    private int age;
    private double weight;
    private double height;

    // Constructor with name, age, weight, height
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor with name, weight, height
    // Default age = 20
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Calculate BMI
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    // Return BMI status
    public String getStatus() {

        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25.0) {
            return "Normal";
        }
        else if (bmi < 30.0) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
}