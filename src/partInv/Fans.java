package partInv;

public class Fans extends Part{
    private int partNum;
    private String manufacturer;
    private String formF;
    private String build_date;
    private int size;
    private String color;
    private String fan_speed;
    private float air_flow;
    private int noise;
    private boolean pwm;

    public Fans (int partNum, String formF, String manufacturer, String build_date,
                 int size, String color, String fan_speed, float air_flow,
                 int noise, boolean pwm){
        super(partNum, formF, manufacturer, build_date);
        size = this.size;
        color = this.color;
        fan_speed = this.fan_speed;
        air_flow = this.air_flow;
        noise = this.noise;
        pwm = this.pwm;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int sz){
        size = sz;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String cl){
        color = cl;
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
}