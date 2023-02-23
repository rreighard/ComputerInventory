package partInv;
import java.awt.*;
import java.util.UUID;

public class Motherboard extends Part{
    private String socket;
    private int memMax;
    private int memSlots;
    private int memSpeed;
    private Color color;

    public Motherboard (String formF, String manufacturer, Color color, double price, String location, String socket,
                        int memMax, int memSlots, int memSpeed){
        super(formF, manufacturer, color, price, location);
        this.socket = socket;
        this.memMax = memMax;
        this.memSlots = memSlots;
        this.memSpeed = memSpeed;
        this.color = color;

    }

    @Override
    public String getPartType(){ return "Motherboard";}
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

    public String toString(){
        return (super.toString() + " " + socket + " " + memMax + " " + memSlots + " " + memSpeed + " " + color);
    }
}