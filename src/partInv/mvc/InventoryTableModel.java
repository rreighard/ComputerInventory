package partInv.mvc;

import partInv.Inventory;
import partInv.Part;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class InventoryTableModel extends AbstractTableModel {
    private String[] columnNames = {"Name", "Form Factor", "Location"};
    private List<Part> invArrayList;

    public InventoryTableModel(List<Part> newList, Inventory inv){

        invArrayList = newList;
    }

    @Override
    public int getRowCount() {
        return invArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return invArrayList.get(row).getName();
            case 1: return invArrayList.get(row).getFormF();
            case 2: return invArrayList.get(row).getLocation();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }
}
