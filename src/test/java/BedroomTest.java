import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        ArrayList<Guest> guest = new ArrayList<>();
        bedroom = new Bedroom(2, RoomType.DOUBLE, 12);

    }

    @Test
    public void hasGotCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasGotRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasGotRoomNumber(){
        assertEquals(12,bedroom.getRoomNumber());
    }

    @Test
    public void canGetGuestCount() {
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void hasGotArrayOfGuests () {
        assertEquals(0, room.getGuests());
    }

}
