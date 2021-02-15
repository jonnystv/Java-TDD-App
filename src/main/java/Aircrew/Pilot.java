package Aircrew;

public class Pilot extends Aircrew {

    private String licenceNumber;
    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }
}
