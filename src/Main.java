public class Main {
    public static void main(String[] args) {
        // Test Vehicle
        Vehicle bike = new Vehicle(2, "Red", 0.5f, "Petrol");
        System.out.println("=== Vehicle Info ===");
        System.out.println("Number of Wheels: " + bike.getNumberOfWheels());
        System.out.println("Color: " + bike.getColor());
        System.out.println("Engine Size: " + bike.getEngineSize());
        System.out.println("Fuel Type: " + bike.getFuelType());
        System.out.println();

        // Test Car
        Car myCar = new Car(4, "Blue", 2.5f, "Gasoline", "Toyota");
        System.out.println("=== Car Info ===");
        myCar.displayInfo();
        myCar.honk();

        // Test setters
        myCar.setColor("Black");
        myCar.setEngineSize(3.0f);
        myCar.setBrand("Honda");
        System.out.println("\n=== Updated Car Info ===");
        myCar.displayInfo();
    }
}
