package Aircraft;

public enum PlaneType {

    B747(30, 300.00),
    B767(10, 100.00),
    B787(20, 200.00);

    private final int passengerCapacity;
    private final double weightLimit;

    PlaneType(int passengerCapacity, double weightLimit) {
        this.passengerCapacity = passengerCapacity;
        this.weightLimit = weightLimit;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    public double getWeightLimit() {
        return weightLimit;
    }
}
