package inclassmvc.view;

import javax.swing.*;

public class HelloForm {
    public JLabel getTextLabel() {
        return textLabel;
    }

    public JLabel getTextValueLabel() {
        return textValueLabel;
    }

    public JButton getReverseBtn() {
        return reverseBtn;
    }

    public JLabel getPosLabel() {
        return posLabel;
    }

    public JTextField getPosTxtFld() {
        return posTxtFld;
    }

    public JButton getSubmitBtn() {
        return submitBtn;
    }

    public JPanel getGuiPanel() {
        return guiPanel;
    }

    private JLabel textLabel;
    private JLabel textValueLabel;
    private JButton reverseBtn;
    private JLabel posLabel;
    private JTextField posTxtFld;
    private JButton submitBtn;
    private JPanel guiPanel;
}
