import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;

    private ArrayList<ConfRoom> confRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.confRooms = new ArrayList<>();
    }

    public int bedroomCount() {
        return bedrooms.size();
    }

    public int confRoomCount() {
        return confRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void addConfRoom(ConfRoom confRoom) {
        confRooms.add(confRoom);
    }

    public void checkIn(Guest guest, RoomType roomType) {
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomType() == roomType)
                bedroom.addGuest(guest);
            return;
        }
    }

    public void checkIn(Guest guest, ConfRoom roomToCheckIn) {
        if (confRooms.contains(roomToCheckIn))
            roomToCheckIn.addGuest(guest);
    }

    public void checkOut(Guest guest) {
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.isGuestInRoom(guest)) {
                bedroom.removeGuests();
            }
        }
        for (ConfRoom confRoom : confRooms) {
            if (confRoom.isGuestInRoom((guest))) {
                confRoom.removeGuests();
            }
        }
    }
}


//checkIn:
//for room in(:) bedrooms
//if room.roomType is single
//room.add(guest)

//checkOut:
//for room in rooms
//if guest in room
//room.removeGuests