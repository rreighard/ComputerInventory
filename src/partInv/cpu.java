package partInv;
import java.awt.*;
import java.util.UUID;
public class cpu extends Part{
    private int core_count;
    private float clock_speed;
    private float bclock_speed;
    private float power_draw;
    private boolean int_graph;

    public cpu (String formF, String manufacturer, Color color, double price, String location, String name, int core_count, float clock_speed,
                float bclock_speed, float power_draw, boolean int_graph){
        super(formF, manufacturer, color, price, location, name);
        this.name = name;
        this.core_count = core_count;
        this.clock_speed = clock_speed;
        this.bclock_speed = bclock_speed;
        this.power_draw = power_draw;
        this.int_graph = int_graph;


    }

    @Override
    public String getPartType(){ return "CPU";}

    public int getCore_count(){
        return core_count;
    }

    public void setCore_count(int cc){
        core_count = cc;
    }

    public float getClock_speed(){
        return clock_speed;
    }

    public void setClock_speed(float cs){
        clock_speed = cs;
    }

    public float getBClock_speed(){
        return bclock_speed;
    }

    public void setBClock_speed(float bcs){
        bclock_speed = bcs;
    }

    public float getPower_draw(){
        return power_draw;
    }

    public void setPower_draw(float pd){
        power_draw = pd;
    }

    public boolean getInt_graph(){
        return int_graph;
    }

    public void setInt_graph(boolean ig){
        int_graph = ig;
    }

    public String toString(){
        return(super.toString() + "\nCore count: " + core_count + " || Clock speed: " + clock_speed + " || Boost clock speed: " + bclock_speed
                + " || Power draw: " + power_draw + "\nIntegrated Graphics: " + int_graph + "\n");
    }

    @Override
    public void movePart(String l){
        location = l;
        System.out.println("This CPU is now located: " + l);
    }

    @Override
    public void applyDiscount(double d){
        price = price * d;
        System.out.println("The CPU's discounted price is: " + String.format("%.2f", price));
    }

}