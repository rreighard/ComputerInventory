package partInv.mvc;

import partInv.Inventory;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import partInv.mvc.InventoryController;

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
    InventoryAdd invAdd;

    public JPanel getTablePanel() {
        return tablePanel;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public InventoryTableView(InventoryController invController, Inventory inv, InventoryAdd invAdd, EditorModel editModel) {
        this.invController = invController;
        this.inv = inv;
        this.invAdd = invAdd;
        initComponents(invController, inv, invAdd, editModel);
    }
    public void initComponents(InventoryController invController, Inventory inv, InventoryAdd invAdd, EditorModel editModel){;
        this.invController = invController;
        tablePanel = new JPanel(new FlowLayout());

        buttonPanel = new JPanel(new GridLayout(1,4));
        invTable = new JTable(invController.getInvTM());
        invTable.getColumnModel(). getColumn(0).setPreferredWidth(25);
        invTable.getColumnModel(). getColumn(1).setPreferredWidth(50);
        doneButton = new JButton("Done");
        doneButton.addActionListener(d -> {
            invController.getInventoryList().getInvList();
        });
        detailsButton = new JButton("Show Details");
        detailsButton.addActionListener(a -> { switchToDetails(); });
        newButton = new JButton("New");
        newButton.addActionListener(n -> {
            invAdd.setVisible(true);
            invAdd.invAddForm().getAddPartBtn().addActionListener(a -> {
                editModel.makeChange(inv, invAdd.invAddForm().getPartTypeFld().getText(), invAdd.invAddForm().getA1Fld().getText(), invAdd.invAddForm().getA2Fld().getText(),
                        invAdd.invAddForm().getA3Fld().getText(), invAdd.invAddForm().getA4Fld().getText(), invAdd.invAddForm().getA5Fld().getText(),
                        invAdd.invAddForm().getA6Fld().getText(), invAdd.invAddForm().getA7Fld().getText(), invAdd.invAddForm().getA8Fld().getText(),
                        invAdd.invAddForm().getA9Fld().getText(), invAdd.invAddForm().getA10Fld().getText(), invAdd.invAddForm().getA11Fld().getText());
                invAdd.setVisible(false);
            });
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
            List<String> temp = invController.getKeyList();
            invController.getViewInd().invFormIndividual()
                    .parseInvIndForm(inv, temp.get(selectedModelRow));
            System.out.println(selectedModelRow);
        }
        invController.getViewInd().setVisible(true);
        //this.setVisible(false);
    }

}