package Aircraft;

public class Plane {

    private PlaneType planeType;
    private String name;

    public Plane(String name, PlaneType planeType) {
        this.planeType = planeType;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getPassengerCapacity() {
        return this.planeType.getPassengerCapacity();
    }

    public double getWeightLimit() {
        return this.planeType.getWeightLimit();
    }

}
