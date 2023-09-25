public class Bike extends Vehicle{
    int gears;
    int weight;
    String model;
    int year;

    public static int AmountOfBikes=0;
    public Bike(int gears, int weight, String model, int year) {
        this.gears = gears;
        this.weight = weight;
        this.model = model;
        this.year = year;
        AmountOfBikes+=1;
    }

    @Override
    public int getGears() {
        return gears;
    }

    @Override
    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }
    void printInfo(){
        System.out.println("Gears: " + getGears());
        System.out.println("Weight: " + getWeight());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Amount of bikes: " + Bike.AmountOfBikes);
    }
}
