package partInv;
import java.awt.*;
import java.util.UUID;
public class Ram extends Part{
    private String name;
    private String type;
    private int speed;
    private Color color;
    private float cas_latency;

    public Ram (String formF, String manufacturer, Color color, double price, String location, String name,
                String type, int speed, float cas_latency){
        super(formF, manufacturer, color, price, location);
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.color = color;
        this.cas_latency = cas_latency;
    }

    @Override
    public String getPartType(){ return "Ram";}

    public String getName() { return name;}

    public void setName(String n) { name = n;}

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

    public Color getColor(){
        return color;
    }

    public void setColor(Color cs){
        color = cs;
    }

    public float getCas_latency(){
        return cas_latency;
    }

    public void setCas_latency(float csl){
        cas_latency = csl;
    }

    public String toString(){
        return (super.toString() + " " + type + " " + speed + " " + color
        + " " + cas_latency);
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