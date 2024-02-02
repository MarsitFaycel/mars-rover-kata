public class Rover {

    private  Coordinate coordinate;
    private  Direction direction ;

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
}
