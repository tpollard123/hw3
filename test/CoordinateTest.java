import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    public void getCoordinateFromPositionTest(){
        //invalid position
        assertEquals(new Coordinate(-1,-1), Coordinate.getCoordinateFromPosition(0));

        assertEquals(new Coordinate(0,0), Coordinate.getCoordinateFromPosition(1));
        assertEquals(new Coordinate(0,1), Coordinate.getCoordinateFromPosition(2));
        assertEquals(new Coordinate(0,2), Coordinate.getCoordinateFromPosition(3));

        assertEquals(new Coordinate(1,0), Coordinate.getCoordinateFromPosition(4));
        assertEquals(new Coordinate(1,1), Coordinate.getCoordinateFromPosition(5));
        assertEquals(new Coordinate(1,2), Coordinate.getCoordinateFromPosition(6));

        assertEquals(new Coordinate(2,0), Coordinate.getCoordinateFromPosition(7));
        assertEquals(new Coordinate(2,1), Coordinate.getCoordinateFromPosition(8));
        assertEquals(new Coordinate(2,2), Coordinate.getCoordinateFromPosition(9));

    }

}