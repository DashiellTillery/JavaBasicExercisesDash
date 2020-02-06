public class Car {
    private int year;
    private int miles;
    private String make;
    private String model;


    public Car(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = 0;
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void drive(int miles) {
        this.miles += miles;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "this car is a " + this.getYear() + " " + this.getMake() + " "+this.getModel() + " with " + this.getMiles() + " miles";
    }
}
