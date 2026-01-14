public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Yersain Almansur", "KZ777");
        Driver driver2 = new Driver("Ayan Bek", "KZ123");

        Vehicle car = new Car("Toyota", 2020, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2019, false);
        Vehicle truck = new Truck("Volvo", 2018, 25.0, 6);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.displayDriver();
            v.stopEngine();
            System.out.println();
        }
    }
}
