import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameBoardTest {

    @BeforeEach
    void setUp() {
        //Add code as needed
    }


    @AfterEach
    void tearDown() {
        //Add code as needed
    }

    /*
        Add at least five unit tests below
     */


    @Test
    public void testGetHasEmptySlot() {
        GameBoard g = new GameBoard();
        assertTrue(g.getHasEmptySlot());
        g.markPositionWithChar('X', 1);
        assertTrue(g.getHasEmptySlot());
        g.markPositionWithChar('O', 2);
        g.markPositionWithChar('X', 3);
        g.markPositionWithChar('O', 4);
        g.markPositionWithChar('X', 5);
        g.markPositionWithChar('O', 6);
        g.markPositionWithChar('X', 7);
        g.markPositionWithChar('O', 8);
        g.markPositionWithChar('X', 9);
        assertFalse(g.getHasEmptySlot());
    }

    @Test
    public void TestMarkPositionWithChar(){
        GameBoard g = new GameBoard();
        g.markPositionWithChar('X', 1);
        assertEquals('X',g.getMarkingAtPosition(1));
    }
}