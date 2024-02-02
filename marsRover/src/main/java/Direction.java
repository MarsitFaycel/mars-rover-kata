public enum Direction {

    NORTH('N'),
    SOUTH('S'),
    EAST('E'),
    WEST('W');

    char value;

    Direction() {
    }

    Direction(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }


}
