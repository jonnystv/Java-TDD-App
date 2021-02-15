import Aircraft.Plane;
import Aircraft.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane testPlane;

    @Before
    public void before(){
        testPlane = new Plane("Spirit of the Abstract", PlaneType.B747);
    }

    @Test
    public void hasName() {
        assertEquals("Spirit of the Abstract", testPlane.getName());
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.B747, testPlane.getPlaneType());
    }

    @Test
    public void hasPassengerCapacity() {
        assertEquals(30, testPlane.getPassengerCapacity());
    }

}
