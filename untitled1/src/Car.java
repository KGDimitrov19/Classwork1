public class Car extends Vehicle{
    int gears;
    int weight;
    String model;
    int year;

    private static int AmountOfCars=0;
    public Car(int gears, int weight, String model, int year) {
        this.gears = gears;
        this.weight = weight;
        this.model = model;
        this.year = year;
        Car.AmountOfCars+=1;
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
        System.out.println("Amount of cars: "+Car.AmountOfCars);
    }
}
