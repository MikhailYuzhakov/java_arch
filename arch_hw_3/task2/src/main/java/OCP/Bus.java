package OCP;

public class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public int getMaxSpeed() {
        return super.maxSpeed = (int) (super.maxSpeed * 0.6);
    }
}
