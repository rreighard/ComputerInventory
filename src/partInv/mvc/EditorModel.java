package partInv.mvc;

import partInv.Case;
import partInv.cpu;
import partInv.Fans;
import partInv.gpu;
import partInv.Motherboard;
import partInv.Part;
import partInv.PowerSupply;
import partInv.Ram;
import partInv.Inventory;
public class EditorModel {

    private String infoToChange;
    private String desiredChange;

    public EditorModel(String iTC, String dC){
        infoToChange = iTC;
        desiredChange = dC;
    }

    public void makeChange(String iTC, String dC){

    }
}
