import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BattlefieldTest {

    private Battlefield harlaw;
    private Knight knight;
    private Castle kildrummy;

    @Before
    public void setUp(){
        harlaw = new Battlefield("Harlaw");
        knight = new Knight();
        kildrummy = new Castle("Kildrummy", 30);
        kildrummy.recruitKnight(knight);
        kildrummy.recruitKnight(knight);
        kildrummy.recruitKnight(knight);
        kildrummy.recruitKnight(knight);
    }

    @Test
    public void hasKnights(){
        assertEquals(0, harlaw.getFellas());
    }

    @Test
    public void canAddKnight(){
        harlaw.addKnight(knight);
        assertEquals(1, harlaw.getFellas());
    }

    @Test
    public void canRemoveKnight(){
        harlaw.addKnight(knight);
        harlaw.addKnight(knight);
        assertEquals(2, harlaw.getFellas());
        harlaw.removeKnight(0);
        assertEquals(1, harlaw.getFellas());
    }

    @Test
    public void canTakeKnightFromCastle_AddToBattlefield(){
        harlaw.addKnightFromCastle(kildrummy);
        assertEquals(1, harlaw.getFellas());
    }
}
