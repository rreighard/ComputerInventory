package partInv.mvc;

import javax.swing.*;

public class InventoryViewEdit extends JFrame {

private InventoryFormEdit invFormEdit;

public InventoryViewEdit(){
        this.invFormEdit = new InventoryFormEdit();
        JPanel content = invFormEdit.getEditPage();
        this.setContentPane(content);
        this.pack();
        this.setTitle("Inventory: Edit Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

public InventoryFormEdit invFormEdit(){ return invFormEdit; }
}
