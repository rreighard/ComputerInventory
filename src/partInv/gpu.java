package partInv;
import java.util.UUID;
public class gpu extends Part{
    private String chipset;
    private int core_count;
    private float clock_speed;
    private float bclock_speed;
    private int length;
    private String color;
    public gpu (UUID partNum, String formF, String manufacturer, String build_date, String chipset
            , float clock_speed, float bclock_speed, int length, String color){
        super(partNum, formF, manufacturer, build_date);
        this.chipset = chipset;
        this.clock_speed = clock_speed;
        this.bclock_speed = bclock_speed;
        this.length = length;
        this.color = color;
    }

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

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        color = c;
    }

    public String toString(){
        return (super.toString() +  " " + chipset +  " "  + clock_speed
                +  " " + bclock_speed + " " + length + " " + color);
    }
}