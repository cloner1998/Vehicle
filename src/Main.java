public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.create();
        MotorVehicle motorVehicle = new Motorcycle();
        motorVehicle.build();
    }
}