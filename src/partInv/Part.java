package partInv;

public class Part{
    protected int partNum;
    protected String manufacturer;
    protected String formF;
    protected String build_date;

    public Part (int partNum, String formF, String manufacturer, String build_date){
        partNum = this.partNum;
        formF = this.formF;
        manufacturer = this.manufacturer;
        build_date = this.build_date;
    }

    public int getpartNum(){
        return partNum;
    }

    public void setPartNum(int nPartNum){
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