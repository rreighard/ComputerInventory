package partInv;
import java.awt.*;
import java.util.UUID;
public class Ram extends Part{
    private String type;
    private int speed;
    private float cas_latency;

    public Ram (String formF, String manufacturer, Color color, double price, String location, String name,
                String type, int speed, float cas_latency){
        super(formF, manufacturer, color, price, location, name);
        this.type = type;
        this.speed = speed;
        this.cas_latency = cas_latency;
    }

    @Override
    public String getPartType(){ return "Ram";}

    public String getType(){
        return type;
    }

    public void setType(String t){
        type = t;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int sp){
        speed = sp;
    }

    public float getCas_latency(){
        return cas_latency;
    }

    public void setCas_latency(float csl){
        cas_latency = csl;
    }

    public String toString(){
        return (super.toString() + "\nType: " + type + "\nSpeed: " + speed + "\nColor: " + color
        + "\nCAS latency: " + cas_latency);
    }
    @Override
    public void movePart(String l){
        location = l;
        System.out.println("This ram is now located: " + l);
    }

    @Override
    public void applyDiscount(double d){
        price = price * d;
        System.out.println("The ram's discounted price is: " + String.format("%.2f", price));
    }

}