package partInv.mvc;

import partInv.mvc.InventoryAddForm;

import javax.swing.*;

public class InventoryAdd extends JFrame {

    private InventoryAddForm addForm;

    public InventoryAdd(){
        this.addForm = new InventoryAddForm();
        JPanel content = addForm.getBckndPanel();
        this.setContentPane(content);
        this.pack();
        this.setTitle("Inventory: Add Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public InventoryAddForm invAddForm(){ return addForm; }
}
