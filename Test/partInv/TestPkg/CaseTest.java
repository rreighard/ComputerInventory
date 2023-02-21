package partInv.TestPkg;

import org.junit.jupiter.api.Test;
import partInv.Case;
import partInv.Ram;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CaseTest {
    @Test
    void setColor() {
        Case cs1 = new Case(UUID.randomUUID(), "Full-Size Tower", "NZXT", "January 20 2023", "White", false, "Tempered Glass", 2);
        cs1.setColor("Black");
        assertEquals("Black", cs1.getColor());
    }

    @Test
    void getPower_supp() {
        Case cs2 = new Case(UUID.randomUUID(), "Full-Size Tower", "NZXT", "January 20 2023", "White", false, "Tempered Glass", 2);
        boolean res = cs2.getPower_supp();
        assertEquals(false, res);
    }

    @Test
    void setPower_supp() {
        Case cs3 = new Case(UUID.randomUUID(), "Full-Size Tower", "NZXT", "January 20 2023", "White", false, "Tempered Glass", 2);
        cs3.setPower_supp(true);
        assertEquals(true, cs3.getPower_supp());
    }

    @Test
    void setType() {
        Ram r1 = new Ram(UUID.randomUUID(), "DDR5", "Corsair", "January 01 2023", "Memory", 5600, "White", .01F);
        r1.setType("System Memory");
        assertEquals("System Memory", r1.getType());
    }
    @Test
    void setColor() {
        Ram r3 = new Ram(UUID.randomUUID(), "DDR5", "Corsair", "January 01 2023", "Memory", 5600, "White", .01F);
        r3.setColor("Black");
        assertEquals("Black", r3.getColor());
    }
    @Test
    void setSpeed(){
        Ram r2 = new Ram(UUID.randomUUID(), "DDR5", "Corsair", "January 01 2023", "Memory", 5600, "White", .01F);
        r2.setSpeed(6000);
        assertEquals(6000, r2.getSpeed());
    }
}