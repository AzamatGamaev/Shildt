public class Truck extends Vehicle {
    private int carGoCap;

    public Truck(int passengers, int fuelCap, int mpg, int carGoCap) {
        super(passengers, fuelCap, mpg);
        this.carGoCap = carGoCap;
    }

    public int getCarGoCap() {
        return carGoCap;
    }

    public void setCarGoCap(int carGoCap) {
        this.carGoCap = carGoCap;
    }
}
