import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RoverPositionTest {
    @Nested
    class shouldHaveDefaultCoordinateAndDirection {


        @ParameterizedTest
        @CsvSource({"0,0", "1,1"})
        void shouldHaveCoordinateX(int input, int currentPosition) {
            Coordinate coordinate = new Coordinate(input, 0);

            Rover rover = new Rover(coordinate, Direction.NORTH);

            Assertions.assertEquals(currentPosition, rover.getCoordinateX());
        }

        @ParameterizedTest
        @CsvSource({"0,0", "1,1"})
        void shouldHaveCoordinateY(int inputY, int currentPositionY) {
            Coordinate coordinate = new Coordinate(0, inputY);

            Rover rover = new Rover(coordinate, Direction.NORTH);
            Assertions.assertEquals(currentPositionY, rover.getCoordinateY());
        }

        @ParameterizedTest
        @CsvSource({"NORTH,N", "EAST,E", "SOUTH,S", "WEST,W"})
        void shouldHaveDirectionN(String inputDirection, char outputDirection) {
            Coordinate coordinate = new Coordinate();

            Rover rover = new Rover(coordinate, Direction.valueOf(inputDirection.toUpperCase()));
            Assertions.assertEquals(outputDirection, rover.getDirection());
        }

        @Test
        void shouldHaveOnly4direction() {

            Assertions.assertThrows(RuntimeException.class, () -> {
                Coordinate coordinate = new Coordinate();
                String inputDirection = "REST";
                Rover rover = new Rover(coordinate,
                        Direction.valueOf("DIRECTION." + inputDirection.toUpperCase()));

            });
        }
    }
}