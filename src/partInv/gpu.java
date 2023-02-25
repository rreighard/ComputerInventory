package partInv;
import java.awt.*;
import java.util.UUID;
public class gpu extends Part{
    private String chipset;
    private int core_count;
    private float clock_speed;
    private float bclock_speed;
    private int length;
    private Color color;
    public gpu (String formF, String manufacturer,  Color color, double price, String location, String chipset
            , float clock_speed, float bclock_speed, int length){
        super(formF, manufacturer, color, price, location);
        this.chipset = chipset;
        this.clock_speed = clock_speed;
        this.bclock_speed = bclock_speed;
        this.length = length;
    }

    @Override
    public String getPartType(){ return "GPU";}
    public String getChipset(){
        return chipset;
    }

    public void setChipset(String cs){
        chipset = cs;
    }

    public float getClock_speed(){
        return clock_speed;
    }

    public void setClock_speed(float cs){
        clock_speed = cs;
    }

    public float getBclock_speed(){
        return bclock_speed;
    }

    public void setBclock_speed(float bcs){
        bclock_speed = bcs;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int l){
        length = l;
    }

    public String toString(){
        return (super.toString() +  " " + chipset +  " "  + clock_speed
                +  " " + bclock_speed + " " + length + " " + color);
    }
    @Override
    public void movePart(String l){
        location = l;
        System.out.println("This GPU is now located: " + l);
    }

    @Override
    public void applyDiscount(double d){
        price = price * d;
        System.out.println("The GPU's discount price: " + String.format("%.2f", price));
    }

}