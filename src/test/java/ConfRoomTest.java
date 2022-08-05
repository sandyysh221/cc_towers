import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConfRoomTest {

    ConfRoom confRoom;

    @Before
    public void before() {
        confRoom = new ConfRoom(25, "The Conference Room");
    }

    @Test
    public void canGetName() {
        assertEquals("The Conference Room", confRoom.getConfRoomName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(25, confRoom.getCapacity());
    }

    @Test
    public void canGetGuestCount() {
        assertEquals(0, confRoom.guestCount());
    }

    @Test
    public void canAddGuest() {
        Guest john = new Guest("John", 25);
        confRoom.addGuest(john);
        assertEquals(1, confRoom.guestCount());
    }

    @Test
    public void canRemoveGuests() {
        Guest john = new Guest("John", 25);
        confRoom.addGuest(john);
        confRoom.removeGuests();
        assertEquals(0, confRoom.guestCount());
    }

    @Test
    public void canCheckIfGuestIsInRoom() {
        Guest john = new Guest("John", 25);
        confRoom.addGuest(john);
        assertTrue(confRoom.isGuestInRoom(john));
    }

    @Test
    public void canCheckIfGuestIsNotInRoom() {
        Guest john = new Guest("John", 25);
        Guest jarrod = new Guest("Jarrod", 25);
        confRoom.addGuest(jarrod);
        assertFalse(confRoom.isGuestInRoom(john));
    }
}
