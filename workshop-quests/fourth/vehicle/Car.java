public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println("Car is moving fast.");
        if ( numberOfDoors == 2) 
            System.out.println("wow this is a coupe !");
    }

    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}


