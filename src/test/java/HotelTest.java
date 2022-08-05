import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom singleRoom;
    Bedroom familyRoom;

    ConfRoom confRoom;

    Guest john;
    Guest jarrod;

    @Before
    public void before() {
        hotel = new Hotel();
        singleRoom = new Bedroom(RoomType.SINGLE, 101);
        familyRoom = new Bedroom(RoomType.FAMILY, 202);
        confRoom = new ConfRoom(25, "The Conference Room");
        john = new Guest("John", 25);
        jarrod = new Guest("Jarrod", 25);
    }

    @Test
    public void canGetBedroomCount() {
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canGetConfRoomCount() {
        assertEquals(0, hotel.confRoomCount());
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(singleRoom);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConfRoom() {
        hotel.addConfRoom(confRoom);
        assertEquals(1, hotel.confRoomCount());
    }

    @Test
    public void canCheckGuestIntoBedroom() {
        hotel.addBedroom(singleRoom);
        hotel.checkIn(john, RoomType.SINGLE);
        assertEquals(1, singleRoom.guestCount());
    }

    @Test
    public void canCheckGuestIntoConfRoom() {
        hotel.addConfRoom(confRoom);
        hotel.checkIn(john, confRoom);
        assertEquals(1, confRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutOfBedroom() {
        hotel.addBedroom(singleRoom);
        hotel.checkIn(john, RoomType.SINGLE);
        hotel.checkOut(john);
        assertEquals(0, singleRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutOfConfRoom() {
        hotel.addConfRoom(confRoom);
        hotel.checkIn(john, confRoom);
        hotel.checkOut(john);
        assertEquals(0, confRoom.guestCount());
    }

}
