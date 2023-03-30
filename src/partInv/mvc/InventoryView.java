package partInv.mvc;

import javax.swing.*;

public class InventoryView extends JFrame {

    private InventoryForm invForm;

    public InventoryView(){
        this.invForm = new InventoryForm();
        JPanel content = invForm.getBckgnd();
        this.setContentPane(content);
        this.pack();
        this.setTitle("Inventory: Main Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public InventoryForm invForm(){ return invForm; }
}
