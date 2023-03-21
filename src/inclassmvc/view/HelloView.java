package inclassmvc.view;

import javax.swing.*;

public class HelloView extends JFrame {
    private HelloForm form;

    public HelloView() {
        this.form = new HelloForm();
        JPanel content = form.getGuiPanel();
        this.setContentPane(content);
        this.pack();
        this.setTitle("Hello World Gui");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public HelloForm form() { return form; }
}