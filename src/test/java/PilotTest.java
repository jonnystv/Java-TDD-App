import Aircrew.Pilot;
import Aircrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Jill Smith", Rank.CAPTAIN, "JAS1968");
    }

    @Test
    public void hasName() {
        assertEquals("Jill Smith", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

}
