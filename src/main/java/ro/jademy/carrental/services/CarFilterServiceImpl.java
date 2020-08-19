package ro.jademy.carrental.services;

import ro.jademy.carrental.data.DataSource;
import ro.jademy.carrental.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarFilterServiceImpl implements CarFilterService{

    private List<Car> carList = DataSource.getCarList();

    @Override
    public List<Car> filterByMake(String make) {
        List<Car> tempCarList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {

        if(carList.get(i).getMake().toLowerCase().contains(make.toLowerCase())){
            tempCarList.add(carList.get(i));
            System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                    carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                    " -> Price per day: " + carList.get(i).getPricePerDay());
        }
    }
        if (tempCarList.isEmpty()) {
            System.out.println("Oops! " + make + " not available!");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByModel(String model) {
        List<Car> tempCarList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {

            if(carList.get(i).getModel().toLowerCase().contains(model.toLowerCase())){
                tempCarList.add(carList.get(i));
                System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                        carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                        " -> Price per day: " + carList.get(i).getPricePerDay());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Oops! " + model + " not available!");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByFuelType(String fuelType) {
        List<Car> tempCarList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {

            if(carList.get(i).getFuelType().toLowerCase().contains(fuelType.toLowerCase())){
                tempCarList.add(carList.get(i));
                System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                        carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                        " -> Price per day: " + carList.get(i).getPricePerDay());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Oops! " + fuelType + " not available!");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByTransmissionType(String transmissionType) {
        List<Car> tempCarList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {

            if(carList.get(i).getTransmissionType().toLowerCase().contains(transmissionType.toLowerCase())){
                tempCarList.add(carList.get(i));
                System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                        carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                        " -> Price per day: " + carList.get(i).getPricePerDay());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Oops! " + transmissionType + " not available!");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByPrice(int minPrice, int maxPrice) {
        List<Car> tempCarList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {

           // if(minPrice >= carList.get(i).getPricePerDay() && carList.get(i).getPricePerDay() <= maxPrice ){
            if(carList.get(i).getPricePerDay() >= minPrice && carList.get(i).getPricePerDay() <= maxPrice ){
                tempCarList.add(carList.get(i));
                System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                        carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                        " -> Price per day: " + carList.get(i).getPricePerDay());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Oops! Cars not found in specified price range");
            return carList;
        } else {
            return tempCarList;
        }
    }

}
