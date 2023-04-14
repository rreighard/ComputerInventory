package partInv.mvc;

import partInv.Inventory;

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
    private JButton prevBtn;
    private JButton nextBtn;
    private JButton quitBtn;

    public JButton getPrevBtn() {
        return prevBtn;
    }

    public JButton getNextBtn() {
        return nextBtn;
    }

    public JButton getQuitBtn() {
        return quitBtn;
    }

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

    public void setEditPage(JPanel editPage) {
        this.editPage = editPage;
    }

    public void setInfoArea(JTextArea infoArea) {
        this.infoArea = infoArea;
    }

    public void setPicturePane(JTextPane picturePane) {
        this.picturePane = picturePane;
    }

    public void setMainPage(JButton mainPage) {
        this.mainPage = mainPage;
    }

    public void setConfirmChange(JButton confirmChange) {
        this.confirmChange = confirmChange;
    }

    public void setViewFull(JButton viewFull) {
        this.viewFull = viewFull;
    }

    public void setViewIndividual(JButton viewIndividual) {
        this.viewIndividual = viewIndividual;
    }

    public void setDesiredChange(JTextField desiredChange) {
        DesiredChange = desiredChange;
    }

    public void setInfoToChangeTextField(JTextField infoToChangeTextField) {
        this.infoToChangeTextField = infoToChangeTextField;
    }

    public void setPrevBtn(JButton prevBtn) {
        this.prevBtn = prevBtn;
    }

    public void setNextBtn(JButton nextBtn) {
        this.nextBtn = nextBtn;
    }

    public void setQuitBtn(JButton quitBtn) {
        this.quitBtn = quitBtn;
    }

    public void parseInvEditForm(Inventory inv, String key){
        this.infoArea.setText(inv.display(key));
    }
}
