package partInv;
import java.util.UUID;
public class Case extends Part{
    private String color;
    private boolean power_supply;
    private String side_panel;
    private int int_bay35;

    public Case (UUID partNum, String formF, String manufacturer, String build_date,
                 String color, boolean power_supply, String side_panel, int int_bay35){
        super(partNum, formF, manufacturer, build_date);
        this.color = color;
        this.power_supply = power_supply;
        this.side_panel = side_panel;
        this.int_bay35 = int_bay35;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String col){
        color = col;
    }
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
        return (super.toString() + " " + color + " " + power_supply + " " + side_panel + " " + int_bay35);
    }
}