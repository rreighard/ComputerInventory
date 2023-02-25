package partInv;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner.*;
import java.util.UUID;
public class TestHarness {

    public TestHarness() {
        cpu c1 = new cpu("AM4", "AMD", Color.BLACK, 499.99, "Shelf 1A", 8, 3.4F, 4.6F, 140, false);
        gpu g1 = new gpu("GeForce RTX 4080", "MSi", Color.BLACK, 3450.99, "Shelf 2A", "GDDR6", 4.3F, 5.7F, 320);

        c1.movePart("Shelf 2A");
        c1.applyDiscount(.75);
        g1.movePart("Shelf 1A");
        g1.applyDiscount(.80);

    }

    public static void main(String args[]){
        TestHarness test = new TestHarness();
    }
}
