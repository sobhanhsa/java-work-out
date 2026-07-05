public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("BMW", 220, 4);
        Vehicle motorcycle = new Motorcycle("Honda", 180, true);

        car.showInfo();
        motorcycle.showInfo();

        Vehicle[] vehicles = {car, motorcycle};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }

        System.out.println();

        // Upcasting
        Vehicle v = new Car("Toyota", 200, 4);

        // Downcasting
        if (v instanceof Car) {
            Car c = (Car) v;
            System.out.println("Number of doors: " + c.getNumberOfDoors());
        }


        System.out.println(v.getVehicleType());
    }
}

// 1. Why is the `Vehicle` class declared as `abstract`?
// because its a base class that is not meant to be instantiated directly. 

// 2. Why is the `move()` method declared as `abstract`?
// because its a base method that is meant to be implemented by subclasses, allowing each subclass to provide its own specific behavior for moving.

// 3. Where in the program is **method overriding** used?
// in child classes

// 4. Where in the program does **polymorphism** occur?
// in method overriding, when the `move()` method is called on the `Vehicle` reference, 

// 5. Which statement demonstrates **upcasting**?
// Vehicle v = new Car("Toyota", 200, 4);

// 6. Which statement demonstrates **downcasting**?
// if (v instanceof Car) {
//     Car c = (Car) v;
// }

// 7. Why can't the `getVehicleType()` method be overridden?
// its final

// 8. Why can't the `VehicleCompany` class be extended?
// because its final
