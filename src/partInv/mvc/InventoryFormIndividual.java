package partInv.mvc;

import partInv.Inventory;

import javax.swing.*;

public class InventoryFormIndividual {
    private JLabel partName;
    private JTextArea partInfo;
    private JTextPane partPhoto;
    private JButton viewFull;
    private JButton mainPage;
    private JButton editPage;
    private JPanel individualPage;
    private JButton nextBtnInd;
    private JButton quitBtnInd;
    private JButton prevBtnInd;



    public JButton getNextBtnInd() {
        return nextBtnInd;
    }

    public JButton getQuitBtnInd() {
        return quitBtnInd;
    }

    public JButton getPrevBtnInd() {
        return prevBtnInd;
    }

    public JPanel getIndividualPage() {
        return individualPage;
    }

    public JLabel getPartName() {
        return partName;
    }

    public JTextArea getPartInfo() {
        return partInfo;
    }

    public JTextPane getPartPhoto() {
        return partPhoto;
    }

    public JButton getViewFull() {
        return viewFull;
    }

    public JButton getMainPage() {
        return mainPage;
    }

    public JButton getEditPage() {
        return editPage;
    }

    public void parseInvIndForm(Inventory inv, String key) {
        this.partInfo.setText(inv.display(key));
    }
}
