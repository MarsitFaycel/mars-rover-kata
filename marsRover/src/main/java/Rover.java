public class Rover {

    private Coordinate coordinate;
    private Direction direction;

    public Rover() {
    }

    public Rover(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public int getCoordinateX() {
        return coordinate.getCoordinateX();
    }

    public int getCoordinateY() {
        return coordinate.getCoordinateY();
    }

    public char getDirection() {
        return direction.getValue();
    }

    public void run(String instruction) {
        for (char ins : instruction.toCharArray()) {
            if (ins == 'f') {
                if (getDirection() == Direction.NORTH.value) {
                    int currentCoordinateY = getCoordinateY();
                    currentCoordinateY = (++currentCoordinateY % 6);
                    coordinate.setCoordinateY(currentCoordinateY);
                }
                if (getDirection() == Direction.EAST.value) {
                    int currentCoordinateX = getCoordinateX();
                    currentCoordinateX = (++currentCoordinateX % 6);
                    coordinate.setCoordinateX(currentCoordinateX);
                }

            }
        }

    }
}
