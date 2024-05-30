class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getFuelType() {
        return fuelType;
    }
    void Details(){
        System.out.println("\nMake: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        return distance / fuelConsumed;
    }
    public double calculateDistance(double time, double speed) {
        return time * speed;
    }
    public double CalulateMaxSpeed(double distance, double time) {
        return distance / time;
    }
}
class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType, int maxLoadCapacity) {
        super(make, model, year, fuelType);
    }
    @Override
    void Details(){
        super.Details();
        System.out.println("Vehicle Type: Truck");
    }
}
class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType, int numberOfSeats) {
        super(make, model, year, fuelType);
    }
    @Override
    void Details(){
        super.Details();
        System.out.println("Vehicle Type: Car");
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    @Override
    void Details(){
        super.Details();
        System.out.println("Vehicle Type: Motorcycle");
    }
}
public class Task3{
    public static void main(String[] args) {
        Vehicle truck = new Truck("Mahindra", "F169", 2010, "Diesel", 5000);
        Vehicle car = new Car("Toyota", "Camry", 2021, "Gasoline", 5);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2019, "Gasoline");

        truck.Details();
        System.out.println("Truck Max Speed: " + truck.calculateFuelEfficiency(435,436) + " km/h");
        car.Details();
        System.out.println("Car Max Speed: " + truck.calculateFuelEfficiency(435,436)+ " km/h");
        motorcycle.Details();
        System.out.println("Motorcycle Max Speed: " + truck.calculateFuelEfficiency(435,436)+ " km/h");
    }
}