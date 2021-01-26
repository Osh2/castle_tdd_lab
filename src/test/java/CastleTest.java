import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CastleTest {

    private Castle castle;
    private Knight knight;

    @Before
    public void before(){
        castle = new Castle("Bothwell", 50);
        knight = new Knight();
    }

    @Test
    public void hasName(){ assertEquals("Bothwell", castle.getLocation()); }

    @Test
    public void orderStartsEmpty(){ assertEquals(0, castle.knightCount()); }

    @Test
    public void canAddKnight_true(){
        castle.recruitKnight(knight);
        assertEquals(1, castle.knightCount());
    }

    @Test
    public void canAddKnight_false(){
        Castle smallCastle = new Castle("Borve", 2);
        smallCastle.recruitKnight(knight);
        smallCastle.recruitKnight(knight);
        smallCastle.recruitKnight(knight);
        assertEquals(2, smallCastle.knightCount());
    }

    @Test
    public void knightCanLeave(){
        castle.recruitKnight(knight);
        castle.recruitKnight(knight);
        Knight grailHunter = castle.errantKnight(0);
        assertEquals(1, castle.knightCount());
        assertEquals(knight, grailHunter);
    }
}
