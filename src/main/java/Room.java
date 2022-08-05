import java.util.ArrayList;

public abstract class Room {

    private int capacity;

    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount() {
        return guests.size();
    }


    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuests() {
        guests.clear();
    }

    public boolean isGuestInRoom(Guest guest) {
        return guests.contains(guest);
    }
}
