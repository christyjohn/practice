package sec06.oops1;

public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car() {
        super();
    }

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore"))
            this.model = model;
        else
            this.model = "Unknown";
    }

    public String getModel() {
        return model;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }
}
