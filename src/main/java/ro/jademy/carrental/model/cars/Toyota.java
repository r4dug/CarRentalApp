package ro.jademy.carrental.model.cars;
import ro.jademy.carrental.model.Car;



public class Toyota extends Car {

    public Toyota () {}

    Car car1 = new Car("Toyota", "C-HR", "Hybrid", "SUV", "Automatic", 123456, 5, 4, 100);


    public void getCarSpecs () {
        System.out.println("ID:"+ car1.getCarId() + " Make:" + car1.getMake() + " Model:" + car1.getModel() + " FuelType:" + car1.getFuelType());
    }
}
