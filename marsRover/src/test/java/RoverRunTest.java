import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class RoverRunTest {
    Rover rover;

    @BeforeEach
    void setUp() {
        Coordinate coordinate = new Coordinate();

        rover = new Rover(coordinate, Direction.NORTH);
    }

    @ParameterizedTest
    @CsvSource({"f,1", "ff,2", "fff,3", "fffff,5", "ffffff,0"})
    void shouldMoveForwardDirectionNORTH(String instructions, int positionY) {
        rover.run(instructions);

        Assertions.assertEquals(positionY, rover.getCoordinateY());
        Assertions.assertEquals(0, rover.getCoordinateX());

    }

    @ParameterizedTest
    @CsvSource({"f,1", "ff,2", "fff,3", "fffff,5", "ffffff,0"})
    void shouldMoveForwardDirectionEAST(String instructions, int positionY) {
        Coordinate coordinate = new Coordinate();

        Rover roverEAST = new Rover(coordinate, Direction.EAST);
        roverEAST.run(instructions);

        Assertions.assertEquals(positionY, roverEAST.getCoordinateX());
        Assertions.assertEquals(0, roverEAST.getCoordinateY());

    }
}
