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


}
