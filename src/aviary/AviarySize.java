package aviary;

public enum AviarySize {
    SMALL(1),
    MEDIUM(2),
    LARGE(3),
    BIG(4);

    private final int value;

    AviarySize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
