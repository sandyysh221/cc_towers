public class ConfRoom extends Room {

    private String confRoomName;
    private RoomType roomType;

    public ConfRoom(int capacity, RoomType roomType, String confRoomName) {
        super(capacity);
        this.roomType = roomType;
        this.confRoomName = confRoomName;

    }
}
