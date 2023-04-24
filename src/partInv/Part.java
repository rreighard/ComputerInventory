package partInv;
import java.awt.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;
public class Part implements PartInterface, Serializable {
    protected UUID partNum;
    protected String manufacturer;
    protected String formF;
    protected LocalDate build_date;
    protected Color color;
    protected double price;
    protected String location;
    protected String name;

    public Part (String formF, String manufacturer, Color cl, double price, String location, String name){
        this.partNum = UUID.randomUUID();
        this.formF = formF;
        this.manufacturer = manufacturer;
        this.build_date = LocalDate.now();
        this.color = cl != null ? cl : Color.BLACK;
        this.price = price;
        this.location = location;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartType() {return "Part";}
    public UUID getPartNum(){
        return partNum;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String man){
        manufacturer = man;
    }

    public String getFormF(){
        return formF;
    }

    public void setFormF(String formFa){
        formF = formFa;
    }

    public LocalDate getBuild_date() {
        return build_date;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color cs){
        color = cs;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String l){
        location = l;
    }

    public String toString(){
        return ("Part number: " + partNum + " || Form factor: " + formF + " || Manufacturer: "
                + manufacturer + " || Build date: " + build_date + "\nColor: " + color + " || Price: " + price + " || Location: " + location
                + " || Name: " + name);
    }

    @Override
    public void movePart(String l){
        location = l;
        System.out.println("This Part is now located: " + l);
    }

    @Override
    public void applyDiscount(double d){
        price = price * d;
        System.out.println("The part's discount price: " + String.format("%.2f", price));
    }
}