import java.util.ArrayList;

public abstract class Room {

    private int capacity;

    private ArrayList<Guest> guest;

    public Room(int capacity){
        this.capacity = capacity;
        this.guest = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestCount() {
        return this.guest.size();
    }

    public void addGuest (Guest guest){
        this.guest.add(guest);
    }


}
