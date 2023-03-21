package partInv;

import java.awt.*;
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Object> partHashMap;

    public Inventory(){
        partHashMap = new HashMap<String, Object>();
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
        if(partHashMap.containsKey(n)){
            System.out.println(partHashMap.get(n));
        }
        else{
            System.out.println("Not Found");
        }
        return n;
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
}
