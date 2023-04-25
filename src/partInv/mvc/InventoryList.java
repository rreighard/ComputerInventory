package partInv.mvc;



import partInv.Inventory;
import partInv.Part;

import java.io.*;
import java.util.ArrayList;

public class InventoryList {

    private EditorModel editModel;
    private InventoryAdd invAdd;
    private Inventory inv;
    ArrayList<Part> invList = new ArrayList<>();
    private String invFileName = "listOfInv.ser";

    public InventoryList(InventoryAdd invAdd, EditorModel editModel, Inventory inv) {
        readInvFile();
        this.invAdd = invAdd;
        this.editModel = editModel;
        this.inv = inv;

        if (invList == null || invList.isEmpty()) {
            for (String x : inv.getKey()) {
                invList.add((Part) inv.getPart(x));
            }
            createInvList(inv, invAdd, editModel);
            writeInvList();
            readInvFile();
        }

        printInvList(inv);


    }

    public void addPart(InventoryAdd invTAdd, EditorModel editTModel) {
        invAdd = invTAdd;
        editModel = editTModel;
        invAdd.setVisible(true);

        invAdd.invAddForm().getAddPartBtn().addActionListener(a -> {
            invList.add((Part) editModel.addEdit(inv, invAdd.invAddForm().getPartTypeFld().getText(), invAdd.invAddForm().getA1Fld().getText(), invAdd.invAddForm().getA2Fld().getText(),
                    invAdd.invAddForm().getA3Fld().getText(), invAdd.invAddForm().getA4Fld().getText(), invAdd.invAddForm().getA5Fld().getText(),
                    invAdd.invAddForm().getA6Fld().getText(), invAdd.invAddForm().getA7Fld().getText(), invAdd.invAddForm().getA8Fld().getText(),
                    invAdd.invAddForm().getA9Fld().getText(), invAdd.invAddForm().getA10Fld().getText(), invAdd.invAddForm().getA11Fld().getText()));
        });
        invAdd.setVisible(false);
    }

    public void removePart(int index) {
        invList.remove(index);
    }

    public ArrayList<Part> getInvList() {
        return invList;
    }

    public void readInvFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(this.invFileName);
            in = new ObjectInputStream(fis);
            invList = (ArrayList) in.readObject();
            in.close();
            if (!invList.isEmpty()) {
                System.out.println("There are no parts in the List");
            }
        } catch (FileNotFoundException fne) {
            System.out.println("File was not found, a new one will be created");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void writeInvList() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(invFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(invList);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void createInvList(Inventory inv, InventoryAdd invAdd, EditorModel editTModel) {

        System.out.println("list created");
    }

    public void printInvList(Inventory inv) {
        System.out.println("Part List:");
        invList.toString();
    }
}

