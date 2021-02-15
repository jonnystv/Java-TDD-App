package Aircrew;

public class FlightAttendant extends Aircrew {

    public FlightAttendant(String name, Rank rank) {
        super(name, rank);
    }

    public String makeAnnouncement() {
        return "Make sure your seat back and folding trays are in their full upright position";
    }

}
