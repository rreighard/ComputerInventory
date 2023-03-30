package partInv.mvc;

import javax.swing.*;

public class InventoryViewFull extends JFrame {

private InventoryFormFull invFormFull;

public InventoryViewFull(){
        this.invFormFull = new InventoryFormFull();
        JPanel content = invFormFull.getFullPage();
        this.setContentPane(content);
        this.pack();
        this.setTitle("Inventory: Full Inventory Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

public InventoryFormFull invFormFull(){ return invFormFull; }
        }
