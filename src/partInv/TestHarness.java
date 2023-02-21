package partInv;

import java.util.ArrayList;
import java.util.Scanner.*;
import java.util.UUID;
public class TestHarness {

    public TestHarness() {
        cpu c1 = new cpu(UUID.randomUUID(), "AM4", "AMD", "Jan 20 2023", 8, 3.4F, 4.6F, 140, false);
        gpu g1 = new gpu(UUID.randomUUID(), "GeForce RTX 4080", "MSi", "Jan 18 2023", "GDDR6", 4.3F, 5.7F, 320, "Black");

        ArrayList<Part> p1 = new ArrayList();
        p1.add(c1);
        p1.add(g1);
    }
}
