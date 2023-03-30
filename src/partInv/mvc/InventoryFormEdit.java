package partInv.mvc;

import javax.swing.*;

public class InventoryFormEdit {
    private JPanel editPage;
    private JTextArea infoArea;
    private JTextPane picturePane;
    private JButton mainPage;
    private JButton confirmChange;
    private JButton viewFull;
    private JButton viewIndividual;
    private JTextField DesiredChange;
    private JTextField infoToChangeTextField;

    public JTextField getInfoToChangeTextField() {
        return infoToChangeTextField;
    }
    public JPanel getEditPage() {
        return editPage;
    }

    public JTextArea getInfoArea() {
        return infoArea;
    }

    public JTextPane getPicturePane() {
        return picturePane;
    }

    public JButton getMainPage() {
        return mainPage;
    }

    public JButton getConfirmChange() {
        return confirmChange;
    }

    public JButton getViewFull() {
        return viewFull;
    }

    public JButton getViewIndividual() {
        return viewIndividual;
    }

    public JTextField getDesiredChange() {
        return DesiredChange;
    }
}
