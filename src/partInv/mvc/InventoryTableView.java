package partInv.mvc;

import partInv.Inventory;
import javax.swing.*;
import java.awt.*;

public class InventoryTableView extends JFrame {

    JPanel tablePanel;
    JPanel buttonPanel;
    JTable invTable;
    JButton doneButton;
    JButton detailsButton;
    JButton newButton;
    JScrollPane tableScroller;
    InventoryController invController;
    Inventory inv;

    public InventoryTableView(InventoryController cc) {
        invController = cc;
        initComponents();
    }
    public void initComponents(){
        tablePanel = new JPanel(new FlowLayout());

        buttonPanel = new JPanel(new GridLayout(1,4));
        invTable = new JTable(invController.getInvTM());
        invTable.getColumnModel(). getColumn(0).setPreferredWidth(25);
        invTable.getColumnModel(). getColumn(1).setPreferredWidth(50);
//        doneButton = new JButton("Done");
//        doneButton.addActionListener(d -> {
//            invController.getCoffeeList().writeCoffeeList();
//        });
        detailsButton = new JButton("Show Details");
        detailsButton.addActionListener(a -> { switchToDetails(); });
        newButton = new JButton("New");
        newButton.addActionListener(n -> {
            switchToDetails();
        });
        buttonPanel.add(newButton);
        buttonPanel.add(detailsButton);
        buttonPanel.add(doneButton);
        tableScroller = new JScrollPane(invTable);
        invTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350,300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
    }


    private void switchToDetails( ) {
        int currentSelection = invTable.getSelectedRow();
        int selectedModelRow = invTable.convertRowIndexToModel(currentSelection);
        if(selectedModelRow < 0) {//if the user does not highlight a row, this will be -1
            //selectedModelRow = 0; //set the model row to the first element in the list
            invController.getViewInd().invFormIndividual().parseInvIndForm(null, invController.getKeyList().get(invController.getCurrentKey()));
        } else {
            invController.getViewInd().invFormIndividual()
                    .parseInvIndForm(inv, invController.getKeyList().get(selectedModelRow));
        }
        invController.getViewInd().setVisible(true);
        //this.setVisible(false);
    }

}