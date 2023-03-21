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
    public void addToHMap(Object o){
        String c = String.valueOf(o.getClass());

        int count = 1;
        for(String x: partHashMap.keySet()){
            if(x.contains(c)){
                count += 1;
            }
        }
        c.concat(Integer.toString(count));
        partHashMap.put(c, o);
    }

    public void removeFromHMap(String inst){
        if(partHashMap.containsKey(inst)){
            partHashMap.remove(inst);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
