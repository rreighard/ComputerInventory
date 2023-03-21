package partInv;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner.*;
import java.util.UUID;
public class TestHarness {

    public TestHarness() {
        cpu c1 = new cpu("AM4", "AMD", Color.BLACK, 499.99, "Shelf 1A", "Ryzen 7 6700",
                8, 3.4F, 4.6F, 140, false);

        gpu g1 = new gpu("GeForce RTX 4080", "MSi", Color.BLACK, 3450.99, "Shelf 2A", "MSi NVIDIA GeForce RTX 4080",
                "GDDR6", 4.3F, 5.7F, 320);
        Case cs1 = new Case("ATX Full Tower", "Corsair", Color.BLACK, 244.99, "Tempered Glass", "Corsair 7000D AIRFLOW ATX Full Tower Case",
                false, "Tempered Glass", 2);

        cpu c2 = new cpu("AM5", "AMD", Color.BLACK, 499.99, "Shelf 1A", "Ryzen 7 7800",
                16, 4.3F, 5.4F, 140, false);

        Inventory inv = new Inventory();
        inv.addToHMap(c1);
        inv.addToHMap(g1);
        inv.addToHMap(cs1);
        inv.addToHMap(c2);

        inv.search("CPU1");
        inv.search("CPU3");
        inv.display("GPU1");
        inv.display("GPU2");
        inv.removeFromHMap("CPU1");
        inv.toString();

    }

    public static void main(String args[]){
        TestHarness test = new TestHarness();
    }
}
