package partInv;
import java.util.UUID;
public class PowerSupply extends Part{
    private String efficiency;
    private int wattage;
    private String modular;
    private String color;

    public PowerSupply (UUID partNum, String formF, String manufacturer, String build_date, String efficiency,
                        int wattage, String modular, String color){
        super(partNum, formF, manufacturer, build_date);
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

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        color = c;
    }

    public String toString(){
        return (super.toString() + " " + efficiency + " " + wattage + " " + modular + " " + color);
    }
}