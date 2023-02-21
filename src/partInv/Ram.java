package partInv;
import java.util.UUID;
public class Ram extends Part{
    private String type;
    private int speed;
    private String color;
    private float cas_latency;

    public Ram (UUID partNum, String formF, String manufacturer, String build_date,
                String type, int speed, String color, float cas_latency){
        super(partNum, formF, manufacturer, build_date);
        this.type = type;
        this.speed = speed;
        this.color = color;
        this.cas_latency = cas_latency;
    }

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

    public String getColor(){
        return color;
    }

    public void setColor(String cs){
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
}