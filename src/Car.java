public class Car extends Vehicle {
    // Additional attribute
    private String brand;

    // Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    // Additional methods
    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
    }

    // Getter and setter for brand
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
}
