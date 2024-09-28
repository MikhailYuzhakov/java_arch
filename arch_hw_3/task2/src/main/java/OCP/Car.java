package OCP;

public class Car extends Vehicle {
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public int getMaxSpeed() {
        return (int)(super.maxSpeed * 0.8);
    }
}
