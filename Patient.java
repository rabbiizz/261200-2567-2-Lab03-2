public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            System.out.println("birthYear is invalid please add positive value.");
            this.birthYear = 2000;
        }

        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("height is invalid please add positive value.");
            this.height = 180;
        }

        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("weight is invalid please add positive value.");
            this.weight = 55;
        }
    }

    public String getBloodGroup(String bloodGroup){
        return bloodGroup;
    }

    public String getPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }

    public int getAge(int currentYear){
        return currentYear - birthYear;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BloodGroup : " + getBloodGroup(bloodGroup));
        System.out.println("Patient phoneNumber: " + getPhoneNumber(phoneNumber));
        System.out.println("Patient BMI: " + getBMI());
    }

    public double getBMI() {
        if (height > 0 || weight > 0) {
            double heightinmeter = height/100;
            return weight/(heightinmeter * heightinmeter);
        }
        else{
        return 0.0;
        }
    }
}

