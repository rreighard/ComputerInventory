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

import java.awt.*;

public class EditorModel {

    public EditorModel(){
    }

    public Object addEdit(Inventory inv, String partType, String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8, String a9, String a10, String a11){

        if(a3.equalsIgnoreCase("black")){
            a3 = String.valueOf(Color.BLACK);
        }
        else if(a3.equalsIgnoreCase("white")){
            a3 = String.valueOf(Color.WHITE);
        }
        else if(a3.equalsIgnoreCase("red")){
            a3 = String.valueOf(Color.RED);
        }
        else if(a3.equalsIgnoreCase("green")){
            a3 = String.valueOf(Color.GREEN);
        }
        else if(a3.equalsIgnoreCase("blue")){
            a3 = String.valueOf(Color.BLUE);
        }
        else{
            a3 = String.valueOf(Color.BLACK);
        }

        if(partType.equalsIgnoreCase("case")){
            inv.addToHMap(new Case(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Boolean.parseBoolean(a7), a8, Integer.parseInt(a9)));
            return new Case(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Boolean.parseBoolean(a7), a8, Integer.parseInt(a9));
        }
        else if(partType.equalsIgnoreCase("cpu")){
            inv.addToHMap(new cpu(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Integer.parseInt(a7), Float.parseFloat(a8), Float.parseFloat(a9), Float.parseFloat(a10), Boolean.parseBoolean(a11)));
            return new cpu(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Integer.parseInt(a7), Float.parseFloat(a8), Float.parseFloat(a9), Float.parseFloat(a10), Boolean.parseBoolean(a11));
        }
        else if(partType.equalsIgnoreCase("gpu")){
            inv.addToHMap(new gpu(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Float.parseFloat(a8), Float.parseFloat(a9), Integer.parseInt(a10)));
            return new gpu(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Float.parseFloat(a8), Float.parseFloat(a9), Integer.parseInt(a10));
        }
        else if(partType.equalsIgnoreCase("fans")){
            inv.addToHMap(new Fans(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Integer.parseInt(a7), a8, Float.parseFloat(a9), Integer.parseInt(a10), Boolean.parseBoolean(a11)));
            return new Fans(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Integer.parseInt(a7), a8, Float.parseFloat(a9), Integer.parseInt(a10), Boolean.parseBoolean(a11));
        }
        else if(partType.equalsIgnoreCase("motherboard")){
            inv.addToHMap(new Motherboard(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), Integer.parseInt(a9), Integer.parseInt(a10)));
            return new Motherboard(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), Integer.parseInt(a9), Integer.parseInt(a10));
        }
        else if(partType.equalsIgnoreCase("power supply")){
            inv.addToHMap(new PowerSupply(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), a9));
            return new PowerSupply(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), a9);
        }
        else{
            inv.addToHMap(new Ram(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), Float.parseFloat(a9)));
            return new Ram(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), Float.parseFloat(a9));
        }
    }

    public void makeChange(Inventory inv, String partType, String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8, String a9, String a10, String a11){

        if(a3.equalsIgnoreCase("black")){
            a3 = String.valueOf(Color.BLACK);
       }
        else if(a3.equalsIgnoreCase("white")){
            a3 = String.valueOf(Color.WHITE);
        }
        else if(a3.equalsIgnoreCase("red")){
            a3 = String.valueOf(Color.RED);
        }
        else if(a3.equalsIgnoreCase("green")){
            a3 = String.valueOf(Color.GREEN);
        }
        else if(a3.equalsIgnoreCase("blue")){
            a3 = String.valueOf(Color.BLUE);
        }
        else{
            a3 = String.valueOf(Color.BLACK);
        }
        
        if(partType.equalsIgnoreCase("case")){
            inv.addToHMap(new Case(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Boolean.parseBoolean(a7), a8, Integer.parseInt(a9)));
        }
        else if(partType.equalsIgnoreCase("cpu")){
            inv.addToHMap(new cpu(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Integer.parseInt(a7), Float.parseFloat(a8), Float.parseFloat(a9), Float.parseFloat(a10), Boolean.parseBoolean(a11)));
        }
        else if(partType.equalsIgnoreCase("gpu")){
            inv.addToHMap(new gpu(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Float.parseFloat(a8), Float.parseFloat(a9), Integer.parseInt(a10)));
        }
        else if(partType.equalsIgnoreCase("fans")){
            inv.addToHMap(new Fans(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, Integer.parseInt(a7), a8, Float.parseFloat(a9), Integer.parseInt(a10), Boolean.parseBoolean(a11)));
        }
        else if(partType.equalsIgnoreCase("motherboard")){
            inv.addToHMap(new Motherboard(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), Integer.parseInt(a9), Integer.parseInt(a10)));
        }
        else if(partType.equalsIgnoreCase("power supply")){
            inv.addToHMap(new PowerSupply(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), a9));
        }
        else if(partType.equalsIgnoreCase("ram")){
            inv.addToHMap(new Ram(a1, a2, Color.decode(a3), Double.parseDouble(a4), a5, a6, a7, Integer.parseInt(a8), Float.parseFloat(a9)));
        }
    }
}
