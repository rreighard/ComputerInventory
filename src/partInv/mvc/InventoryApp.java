package partInv.mvc;

import partInv.Inventory;
import partInv.cpu;
import partInv.gpu;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class InventoryApp {

    public static void main(String args[]){

        String infoToChange = "";
        String desiredChange = "";
        String currentKey = "CPU1";
        String logs = "";
        List<String> keys = new ArrayList<>();

        RecentLogModel recentLogModel = new RecentLogModel(logs);
        EditorModel editorModel = new EditorModel(infoToChange, desiredChange);
        InventoryView view = new InventoryView();
        InventoryViewEdit viewEdit = new InventoryViewEdit();
        InventoryViewFull viewFull = new InventoryViewFull();
        InventoryViewIndividual viewIndividual = new InventoryViewIndividual();
        Inventory inv = new Inventory();

        inv.addToHMap(new cpu("AM4", "AMD", Color.BLACK, 156.99, "Shelf 2A", "AMD Ryzen 5 5600X 3.7 GHz 6-Core Processor",
                6, 3.7F, 4.6F, 65, false));
        keys.add("CPU1");

        inv.addToHMap(new cpu("AM4", "AMD", Color.BLACK, 242.99, "Shelf 2A", "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor",
                8, 3.8F, 4.7F, 105, false));
        keys.add("CPU2");

        inv.addToHMap(new gpu("GDDR6X", "ASUS", Color.BLACK, 799.99, "Shelf 2B", "Asus TUF GAMING GeForce RTX 4070 Ti 12 GB Video Card",
                "GeForce RTX 4070 Ti", 2310F, 2640F, 305));
        keys.add("GPU1");

        InventoryController controller = new InventoryController(viewEdit, view, viewFull, viewIndividual, recentLogModel, inv, currentKey, keys);

        currentKey = keys.get(controller.getCurrentKey());
        System.out.println(keys);
        view.setVisible(true);
    }
}
