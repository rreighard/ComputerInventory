package inclassmvc;

import inclassmvc.inclasscontroller.HelloController;
import inclassmvc.model.StringWrapperModel;
import inclassmvc.view.HelloView;

public class HelloApp {
    public static void main(String args[]){
        StringWrapperModel model = new StringWrapperModel("Ryan Reighard");
        HelloView view = new HelloView();
        HelloController controller = new HelloController(model, view);
        view.setVisible(true);
    }
}
