package partInv;
import java.awt.*;
import java.util.UUID;
public class PowerSupply extends Part{
    private String efficiency;
    private int wattage;
    private String modular;

    @Override
    public String getPartType(){ return "Power Supply";}
    public PowerSupply (String formF, String manufacturer, Color color, double price, String location, String name, String efficiency,
                        int wattage, String modular){
        super(formF, manufacturer, color, price, location, name);
        this.efficiency = efficiency;
        this.wattage = wattage;
        this.modular = modular;
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
        return (super.toString() + "\nEfficiency: " + efficiency + " || Wattage: " + wattage + " || Modularity: " + modular + "\n");
    }

    @Override
    public void movePart(String l){
        location = l;
        System.out.println("This power supply is now located: " + l);
    }

    @Override
    public void applyDiscount(double d){
        price = price * d;
        System.out.println("The power supply's discounted price is: " + String.format("%.2f", price));
    }

}