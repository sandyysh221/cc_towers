import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        ArrayList<Guest> guest = new ArrayList<>();
        bedroom = new Bedroom(RoomType.DOUBLE, 12);

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
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest() {
        Guest john = new Guest("John", 25);
        bedroom.addGuest(john);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuests() {
        Guest john = new Guest("John", 25);
        bedroom.addGuest(john);
        bedroom.removeGuests();
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canCheckIfGuestIsInRoom() {
        Guest john = new Guest("John", 25);
        bedroom.addGuest(john);
        assertTrue(bedroom.isGuestInRoom(john));
    }

    @Test
    public void canCheckIfGuestIsNotInRoom() {
        Guest john = new Guest("John", 25);
        Guest jarrod = new Guest("Jarrod", 25);
        bedroom.addGuest(jarrod);
        assertFalse(bedroom.isGuestInRoom(john));
    }
}
