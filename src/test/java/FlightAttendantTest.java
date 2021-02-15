import Aircrew.Aircrew;
import Aircrew.FlightAttendant;
import Aircrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightAttendantTest {

    FlightAttendant flightAttendant;

    @Before
    public void before() {
        flightAttendant = new FlightAttendant("Bob Smith",Rank.CHIEF_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Bob Smith", flightAttendant.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CHIEF_ATTENDANT, flightAttendant.getRank());
    }

    @Test
    public void canMakeAnnouncement() {
        assertEquals("Make sure your seat back and folding trays are in their full upright position", flightAttendant.makeAnnouncement());
    }
}


