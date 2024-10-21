class Vehicle {
    private String make;
    private String model;
    private int year;

    public void setDetails(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getDetails() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}

class Car extends Vehicle {
    private int numDoors;
    private boolean isConvertible;

    public void setCarDetails(String make, String model, int year, int numDoors, boolean isConvertible) {
        setDetails(make, model, year);
        this.numDoors = numDoors;
        this.isConvertible = isConvertible;
    }

    public String getCarDetails() {
        return getDetails() + ", Number of Doors: " + numDoors + ", Convertible: " + (isConvertible ? "Yes" : "No");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setDetails("Toyota", "Camry", 2020);
        System.out.println("Vehicle Details: " + vehicle.getDetails());

        Car car = new Car();
        car.setCarDetails("Honda", "Civic", 2021, 4, false);
        System.out.println("Car Details: " + car.getCarDetails());
    }
}
