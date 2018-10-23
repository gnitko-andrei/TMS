package classwork.cw5;

public enum Side {
    EAST(0),
    WEST(1),
    NORTH(2),
    SOUTH(3);

    int index;

    private Side(int index) {
        this.index = index;
    }

    public static Side getByIndex(int index) {
        switch(index) {
            case 0:
                return EAST;
            case 1:
                return WEST;
            case 2:
                return NORTH;
            case 3:
                return SOUTH;
            default:
                return null;
        }
    }
}