package partInv;
import java.util.UUID;
public class Part{
    protected UUID partNum;
    protected String manufacturer;
    protected String formF;
    protected String build_date;

    public Part (UUID partNum, String formF, String manufacturer, String build_date){
        this.partNum = partNum;
        this.formF = formF;
        this.manufacturer = manufacturer;
        this.build_date = build_date;
    }

    public UUID getpartNum(){
        return partNum;
    }

    public void setPartNum(UUID nPartNum){
        partNum = nPartNum;
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

    public String getBuild_date(){
        return build_date;
    }

    public void setBuild_date(String bd){
        build_date = bd;
    }
    public String toString(){
        return (partNum + " " + formF + " " + manufacturer + " " + build_date);
    }
}