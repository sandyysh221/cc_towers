public class ConfRoom extends Room {

    private String confRoomName;

    public ConfRoom(int capacity, String confRoomName) {
        super(capacity);
        this.confRoomName = confRoomName;
    }

    public String getConfRoomName() {
        return confRoomName;
    }
}
