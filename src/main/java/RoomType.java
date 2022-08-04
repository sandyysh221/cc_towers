public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4);

    private final int maxCapacity;

    RoomType(int capacity) {
        this.maxCapacity = capacity;
    }

    public int getCapacity() {
        return maxCapacity;
    }
}
