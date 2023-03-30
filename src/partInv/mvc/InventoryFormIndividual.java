package partInv.mvc;

import javax.swing.*;

public class InventoryFormIndividual {
    private JLabel partName;
    private JTextArea partInfo;
    private JTextPane partPhoto;
    private JButton viewFull;
    private JButton mainPage;
    private JButton editPage;
    private JPanel individualPage;

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
}
