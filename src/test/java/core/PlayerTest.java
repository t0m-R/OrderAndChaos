package core;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testColor() {
        Player player = new Player(Color.black);
        assertEquals(player.getColor(), Color.black);
    }




}
