package ro.jademy.carrental.model;

public class Customer extends User{

    public Customer(String username, String password, String firstName, String lastName, int age, int yearsOfDriving) {
        super(username, password, firstName, lastName);
        this.age = age;
        this.yearsOfDriving = yearsOfDriving;
    }


    private int age;
    private int yearsOfDriving;
    private long totalAmountToBePaid;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfDriving() {
        return yearsOfDriving;
    }

    public void setYearsOfDriving(int yearsOfDriving) {
        this.yearsOfDriving = yearsOfDriving;
    }

    public long getTotalAmountToBePaid() {
        return totalAmountToBePaid;
    }

    public void setTotalAmountToBePaid(long totalAmountToBePaid) {
        this.totalAmountToBePaid = totalAmountToBePaid;
    }

    /*    public RentedCar getCurrentRentedCar() {
        for (RentedCar rentedCarItem : rentedCarHistory ) {

            if (rentedCarItem.isCurrentlyRented()) {
                return rentedCarItem;
            }
        }
        return null;
    }*/

}
