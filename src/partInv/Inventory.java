package partInv;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Inventory {
    private HashMap<String, Object> partHashMap;

    public Inventory(){
        partHashMap = new HashMap<String, Object>();
    }

    public void editPartHashMap(String iTC, String dC, String key){
        if(key.contains("CPU")){
            if(iTC.equalsIgnoreCase("name")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setName(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("formF")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setFormF(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("manufacturer")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setManufacturer(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("color")){
                cpu temp = (cpu) partHashMap.get(key);
                if(dC.equalsIgnoreCase("black")){
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("white")){
                    temp.setColor(Color.WHITE);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("red")){
                    temp.setColor(Color.RED);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("green")){
                    temp.setColor(Color.GREEN);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("blue")){
                    temp.setColor(Color.BLUE);
                    partHashMap.put(key, temp);
                }
                else{
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
            }
            else if(iTC.equalsIgnoreCase("price")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setPrice(Double.parseDouble(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("location")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setLocation(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("core count")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setCore_count(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("clock speed")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setClock_speed(Float.parseFloat(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("boost clock speed")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setBClock_speed(Float.parseFloat(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("power draw")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setPower_draw(Float.parseFloat(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("integrated graphics")){
                cpu temp = (cpu) partHashMap.get(key);
                temp.setInt_graph(Boolean.parseBoolean(dC));
                partHashMap.put(key, temp);
            }
        }
        else if(key.contains("GPU")){
            if(iTC.equalsIgnoreCase("name")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setName(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("formF")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setFormF(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("manufacturer")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setManufacturer(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("color")){
                gpu temp = (gpu) partHashMap.get(key);
                if(dC.equalsIgnoreCase("black")){
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("white")){
                    temp.setColor(Color.WHITE);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("red")){
                    temp.setColor(Color.RED);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("green")){
                    temp.setColor(Color.GREEN);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("blue")){
                    temp.setColor(Color.BLUE);
                    partHashMap.put(key, temp);
                }
                else{
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
            }
            else if(iTC.equalsIgnoreCase("price")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setPrice(Double.parseDouble(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("location")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setLocation(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("chipset")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setChipset(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("clock speed")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setClock_speed(Float.parseFloat(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("boost clock speed")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setBclock_speed(Float.parseFloat(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("length")){
                gpu temp = (gpu) partHashMap.get(key);
                temp.setLength(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
        }
        else if(key.contains("Case")){
            if(iTC.equalsIgnoreCase("name")){
                Case temp = (Case) partHashMap.get(key);
                temp.setName(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("formF")){
                Case temp = (Case) partHashMap.get(key);
                temp.setFormF(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("manufacturer")){
                Case temp = (Case) partHashMap.get(key);
                temp.setManufacturer(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("color")){
                Case temp = (Case) partHashMap.get(key);
                if(dC.equalsIgnoreCase("black")){
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("white")){
                    temp.setColor(Color.WHITE);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("red")){
                    temp.setColor(Color.RED);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("green")){
                    temp.setColor(Color.GREEN);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("blue")){
                    temp.setColor(Color.BLUE);
                    partHashMap.put(key, temp);
                }
                else{
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
            }
            else if(iTC.equalsIgnoreCase("price")){
                Case temp = (Case) partHashMap.get(key);
                temp.setPrice(Double.parseDouble(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("location")){
                Case temp = (Case) partHashMap.get(key);
                temp.setLocation(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("Power supply")){
                Case temp = (Case) partHashMap.get(key);
                temp.setPower_supp(Boolean.parseBoolean(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("side panel")){
                Case temp = (Case) partHashMap.get(key);
                temp.setSide_panel(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("int bay")){
                Case temp = (Case) partHashMap.get(key);
                temp.setInt_bay35(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
        }
        else if(key.contains("Fans")){
            if(iTC.equalsIgnoreCase("name")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setName(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("formF")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setFormF(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("manufacturer")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setManufacturer(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("color")){
                Fans temp = (Fans) partHashMap.get(key);
                if(dC.equalsIgnoreCase("black")){
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("white")){
                    temp.setColor(Color.WHITE);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("red")){
                    temp.setColor(Color.RED);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("green")){
                    temp.setColor(Color.GREEN);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("blue")){
                    temp.setColor(Color.BLUE);
                    partHashMap.put(key, temp);
                }
                else{
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
            }
            else if(iTC.equalsIgnoreCase("price")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setPrice(Double.parseDouble(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("location")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setLocation(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("size")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setSize(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("fan speed")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setFan_speed(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("air flow")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setAir_flow(Float.parseFloat(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("noise")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setNoise(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("pwm")){
                Fans temp = (Fans) partHashMap.get(key);
                temp.setPwm(Boolean.parseBoolean(dC));
                partHashMap.put(key, temp);
            }
        }
        else if(key.contains("Motherboard")){
            if(iTC.equalsIgnoreCase("name")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setName(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("formF")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setFormF(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("manufacturer")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setManufacturer(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("color")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                if(dC.equalsIgnoreCase("black")){
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("white")){
                    temp.setColor(Color.WHITE);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("red")){
                    temp.setColor(Color.RED);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("green")){
                    temp.setColor(Color.GREEN);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("blue")){
                    temp.setColor(Color.BLUE);
                    partHashMap.put(key, temp);
                }
                else{
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
            }
            else if(iTC.equalsIgnoreCase("price")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setPrice(Double.parseDouble(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("location")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setLocation(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("socket")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setSocket(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("max memory")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setMemMax(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("memory slots")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setmemSlots(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("memory speed")){
                Motherboard temp = (Motherboard) partHashMap.get(key);
                temp.setMemSpeed(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
        }
        else if(key.contains("PowerSupply")){
            if(iTC.equalsIgnoreCase("name")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setName(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("formF")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setFormF(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("manufacturer")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setManufacturer(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("color")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                if(dC.equalsIgnoreCase("black")){
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("white")){
                    temp.setColor(Color.WHITE);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("red")){
                    temp.setColor(Color.RED);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("green")){
                    temp.setColor(Color.GREEN);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("blue")){
                    temp.setColor(Color.BLUE);
                    partHashMap.put(key, temp);
                }
                else{
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
            }
            else if(iTC.equalsIgnoreCase("price")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setPrice(Double.parseDouble(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("location")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setLocation(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("efficiency")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setEfficiency(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("wattage")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setWattage(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("modular")){
                PowerSupply temp = (PowerSupply) partHashMap.get(key);
                temp.setModular(dC);
                partHashMap.put(key, temp);
            }
        }
        else if(key.contains("Ram")){
            if(iTC.equalsIgnoreCase("name")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setName(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("formF")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setFormF(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("manufacturer")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setManufacturer(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("color")){
                Ram temp = (Ram) partHashMap.get(key);
                if(dC.equalsIgnoreCase("black")){
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("white")){
                    temp.setColor(Color.WHITE);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("red")){
                    temp.setColor(Color.RED);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("green")){
                    temp.setColor(Color.GREEN);
                    partHashMap.put(key, temp);
                }
                else if(dC.equalsIgnoreCase("blue")){
                    temp.setColor(Color.BLUE);
                    partHashMap.put(key, temp);
                }
                else{
                    temp.setColor(Color.BLACK);
                    partHashMap.put(key, temp);
                }
            }
            else if(iTC.equalsIgnoreCase("price")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setPrice(Double.parseDouble(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("location")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setLocation(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("type")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setType(dC);
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("speed")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setSpeed(Integer.parseInt(dC));
                partHashMap.put(key, temp);
            }
            else if(iTC.equalsIgnoreCase("cas latency")){
                Ram temp = (Ram) partHashMap.get(key);
                temp.setCas_latency(Float.parseFloat(dC));
                partHashMap.put(key, temp);
            }
        }
    }

    public Object getPart(String key){
        return partHashMap.get(key);
    }

    public ArrayList<String> getKey(){

        ArrayList<String> keys = new ArrayList<>();
        for(String x: partHashMap.keySet()){
            keys.add(x);
        }
        return keys;
    }

    public String search(String term){
        if(partHashMap.containsKey(term)){
            System.out.println(partHashMap.get(term));
        }
        else{
            System.out.println("Not Found");
        }
        return term;
    }

    public String display(String n){
        String text = "";
        if(partHashMap.containsKey(n)){
            text = (partHashMap.get(n).toString());
        }
        else{
            System.out.println("Not Found");
        }
        return text;
    }
    public void addToHMap(Part o){
        String c = o.getPartType();

        int count = 1;
        for(String x: partHashMap.keySet()){
            if(x.contains(c)){
                count += 1;
            }
        }
        c += Integer.toString(count);
        partHashMap.put(c, o);
    }

    public void removeFromHMap(String inst){
        if(partHashMap.containsKey(inst)){
            partHashMap.remove(inst);
            System.out.println("remove success");
        }
        else{
            System.out.println("Not Found");
        }
    }

    public String toString(){

        String ts = "";
         for (String i : partHashMap.keySet()){
             ts += "Key: " + i + " val: " + partHashMap.get(i) + "\n";
         }
        return ts;
    }

    public String logsToString(){
        int count = 0;
        String lts = "";
        for (String i : partHashMap.keySet()){
            lts += "Key: " + i + " val: " + partHashMap.get(i) + "\n";
            count ++;
            if (count == 4){
                break;
            }
        }
        return lts;
    }

    public String getFirst(){
        Map.Entry<String, Object> firstEntry = partHashMap.entrySet().iterator().next();
        String getF = firstEntry.getKey();
        return getF;
    }
}
