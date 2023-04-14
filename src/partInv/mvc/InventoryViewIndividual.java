package partInv.mvc;

import javax.swing.*;

public class InventoryViewIndividual extends JFrame {

private InventoryFormIndividual invFormIndividual;

public InventoryViewIndividual(){
        this.invFormIndividual = new InventoryFormIndividual();
        JPanel content = invFormIndividual.getIndividualPage();
        this.setContentPane(content);
        this.pack();
        this.setTitle("Inventory: Individual Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

public InventoryFormIndividual invFormIndividual() { return invFormIndividual; }
        }
