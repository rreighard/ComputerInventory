package partInv;
import java.awt.*;
import java.util.UUID;
public class Case extends Part{
    private String name;
    private Color color;
    private boolean power_supply;
    private String side_panel;
    private int int_bay35;

    public Case (String formF, String manufacturer, Color color, double price, String location, String name,
                 boolean power_supply, String side_panel, int int_bay35){
        super(formF, manufacturer, color, price, location);
        this.name = name;
        this.color = color;
        this.power_supply = power_supply;
        this.side_panel = side_panel;
        this.int_bay35 = int_bay35;
    }


    @Override
    public String getPartType(){ return "Case";}

    public boolean getPower_supp(){
        return power_supply;
    }

    public void setPower_supp(boolean ps){
        power_supply = ps;
    }

    public String getSide_panel(){
        return side_panel;
    }

    public void setSide_panel(String sp){
        side_panel = sp;
    }

    public int getInt_bay35(){
        return int_bay35;
    }

    public void setInt_bay35(int ib35) {
        int_bay35 = ib35;
    }

    public String toString(){
        return (super.toString() + "\nColor: " + color + "\nInt Power Supply: " + power_supply + "\nSide Panel: " + side_panel + "\nInt Bays: " + int_bay35);
    }

    @Override
    public void movePart(String l){
        location = l;
        System.out.println("This case is now located: " + l);
    }

    @Override
    public void applyDiscount(double d){
        price = price * d;
        System.out.println("The case's discounted price is: " + String.format("%.2f", price));
    }
}