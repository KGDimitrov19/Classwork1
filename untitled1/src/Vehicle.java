public class Vehicle {
    int gears;
    int weight;
    String model;
    int year;

    public Vehicle() {

    }

    public Vehicle(int gears, int weight, String model, int year) {
        this.gears = gears;
        this.weight = weight;
        this.model = model;
        this.year = year;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void printInfo(){
        System.out.println("Gears: " + getGears());
        System.out.println("Weight: " + getWeight());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
    }
    public static void main(String[] args) {
             Bike bike = new Bike(30, 20, "Shockblaze", 2017);
             Car car = new Car(6,3000,"VW", 1999);

             bike.printInfo();
             car.printInfo();

    }
}
