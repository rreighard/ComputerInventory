package inclassCoffee;

import javax.swing.*;

public class coffeeDetails {
    private JLabel titleLabel;
    private JCheckBox isIcedCheckBox;
    private JLabel flavorLbl;
    private JTextField flavorTxtFld;
    private JLabel creamerLbl;
    private JTextField creamerTxtFld;
    private JLabel sizeLbl;
    private JTextField sizeTxtFld;
    private JLabel roastLbl;
    private JTextField roastTxtFld;
    private JCheckBox finishedCkBox;
    private JButton nextBtn;
    private JButton prevBtn;
    private JButton addBtn;
    private JButton quitBtn;
    private JButton removeBtn;

    public void parseCoffeeDetails(Coffee coffee) {
        this.isIcedCheckBox.setSelected(coffee.isIced);
        this.creamerTxtFld.setText(coffee.cream);
        this.finishedCkBox.setSelected(coffee.getDrank());
        this.flavorTxtFld.setText(coffee.flavors)
    }

    public void clearCoffeeDetails(Coffee coffee) {
        this.isIcedCheckBox.setSelected(coffee.isIced);
        this.creamerTxtFld.setText(coffee.cream);
        this.finishedCkBox.setSelected(coffee.getDrank());
        this.flavorTxtFld.setText(coffee.flavors)
    }
}
