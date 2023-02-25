package partInv;
import java.awt.*;
import java.util.UUID;
public class Fans extends Part{
    private int size;
    private Color color;
    private String fan_speed;
    private float air_flow;
    private int noise;
    private boolean pwm;

    public Fans (String formF, String manufacturer, Color color, double price, String location,
                 int size,String fan_speed, float air_flow,
                 int noise, boolean pwm){
        super(formF, manufacturer, color, price, location);
        this.size = size;
        this.color = color;
        this.fan_speed = fan_speed;
        this.air_flow = air_flow;
        this.noise = noise;
        this.pwm = pwm;
    }

    @Override
    public String getPartType(){ return "Fan";}
    public int getSize(){
        return size;
    }

    public void setSize(int sz){
        size = sz;
    }

    public String getFan_speed(){
        return fan_speed;
    }

    public void setFan_speed(String fs){
        fan_speed = fs;
    }

    public float getAir_flow(){
        return air_flow;
    }

    public void setAir_flow(float af){
        air_flow = af;
    }

    public int getNoise(){
        return noise;
    }

    public void setNoise(int ns){
        noise = ns;
    }

    public boolean getPwm(){
        return pwm;
    }

    public void setPwm(boolean pm){
        pwm = pm;
    }

    public String toString(){
        return (super.toString() + " " + size + " " + color + " " + fan_speed + " " +
                air_flow + " " + noise + " " + pwm);
    }

    @Override
    public void movePart(String l){
        location = l;
        System.out.println("This fan is now located: " + l);
    }

    @Override
    public void applyDiscount(double d){
        price = price * d;
        System.out.println("The fan's discounted price is: " + String.format("%.2f", price));
    }
}