package partInv;
import java.util.UUID;

public class Motherboard extends Part{
    private String socket;
    private int memMax;
    private int memSlots;
    private int memSpeed;
    private String color;

    public Motherboard (UUID partNum, String formF, String manufacturer, String build_date, String socket,
                        int memMax, int memSlots, int memSpeed, String color){
        super(partNum, formF, manufacturer, build_date);
        this.socket = socket;
        this.memMax = memMax;
        this.memSlots = memSlots;
        this.memSpeed = memSpeed;
        this.color = color;

    }

    public String getSocket(){
        return socket;
    }

    public void setSocket(String s){
        socket = s;
    }

    public int getMemMax(){
        return memMax;
    }

    public void setMemMax(int mm){
        memMax = mm;
    }

    public int getMemSlots(){
        return memSlots;
    }

    public void setmemSlots(int ms){
        memSlots = ms;
    }

    public int getMemSpeed(){
        return memSpeed;
    }

    public void setMemSpeed(int ms){
        memSpeed = ms;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        color = c;
    }

    public String toString(){
        return (super.toString() + " " + socket + " " + memMax + " " + memSlots + " " + memSpeed + " " + color);
    }
}