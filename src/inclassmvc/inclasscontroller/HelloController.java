package inclassmvc.inclasscontroller;

import inclassmvc.model.StringWrapperModel;
import inclassmvc.view.HelloView;

public class HelloController {
    private StringWrapperModel model;
    private HelloView view;

    public HelloController(StringWrapperModel model, HelloView view) {
        this.model = model;
        this.view = view;

        // First: make the form display the text from this.model
        view.form().getTextValueLabel().setText(model.getText());
        // now attach event handling logic to the two buttons...
        // note: you'll need to call model.setText(..) in each to update the model
        //       with the changed/reversed text
        view.form().getReverseBtn().addActionListener(a -> {
           String rvStr = model.reverseText();
           view.form().getTextValueLabel().setText(model.getText());
           model.setText(rvStr);

        });

        view.form().getSubmitBtn().addActionListener( a -> {
            String txt = view.form().getPosTxtFld().getText();

            model.setText(model.getText() + txt);
            view.form().getTextValueLabel().setText(model.getText());
            view.form().getPosTxtFld().setText(" ");
        });
    }
}