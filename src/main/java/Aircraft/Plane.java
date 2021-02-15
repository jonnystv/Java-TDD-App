package Aircraft;

public class Plane {

    private PlaneType planeType;
    private PlaneType passengerCapacity;
    private PlaneType weightLimit;
    private String name;

    public Plane(String name, PlaneType planeType, PlaneType passengerCapacity, PlaneType weightLimit) {
        this.planeType = planeType;
        this.passengerCapacity = passengerCapacity;
        this.weightLimit = weightLimit;
        this.name = name;
    }
}
