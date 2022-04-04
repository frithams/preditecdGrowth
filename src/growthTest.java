import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class growthTest {

    @Test
    void calcualteSubs() {
        growth g = new growth();
        g.calcualteSubs(30, 0.025, 1);
        assertEquals(g.calcualteSubs(30, 0.025, 1), 31);
    }
}