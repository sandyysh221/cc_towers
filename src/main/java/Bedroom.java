import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;

    private int roomNumber;


    public Bedroom(int capacity, RoomType roomType, int roomNumber) {
        super(capacity);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return roomType.getCapacity();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
