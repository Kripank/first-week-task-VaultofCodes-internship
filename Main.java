class Car {
    private String make;
    private String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void start() {
        System.out.println("Starting the car.");
    }
    // Adding a stop() method
    public void stop() {
        System.out.println("Stopping the car.");
    }
    // Getter methods to access make and model
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
}
public class Main{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();
        // Accessing make and model using getter methods
        String carMake = car.getMake();
        String carModel = car.getModel();
        System.out.println("Make: " + carMake);
        System.out.println("Model: " + carModel);
    }
}
