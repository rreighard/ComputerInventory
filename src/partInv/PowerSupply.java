package partInv;
import java.awt.*;
import java.util.UUID;
public class PowerSupply extends Part{
    private String efficiency;
    private int wattage;
    private String modular;
    private Color color;


    @Override
    public String getPartType(){ return "Power Supply";}
    public PowerSupply (String formF, String manufacturer, Color color, double price, String location, String efficiency,
                        int wattage, String modular){
        super(formF, manufacturer, color, price, location);
        this.efficiency = efficiency;
        this.wattage = wattage;
        this.modular = modular;
        this.color = color;
    }

    public String getEfficiency(){
        return efficiency;
    }

    public void setEfficiency(String e){
        efficiency = e;
    }

    public int getWattage(){
        return wattage;
    }

    public void setWattage(int w){
        wattage = w;
    }

    public String getModular(){
        return modular;
    }

    public void setModular(String m){
        modular = m;
    }

    public String toString(){
        return (super.toString() + " " + efficiency + " " + wattage + " " + modular + " " + color);
    }
}