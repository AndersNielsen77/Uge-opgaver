package aflevering3.bag;

import java.util.ArrayList;
import java.util.Collections;

public class OrderedBagWithoutRepetitions implements Bag{
    //Opretter ArrayList
    ArrayList<String> items = new ArrayList<>();

    public boolean addString(String str) {
        if(items.contains(str)){
            return false;
        }
        else if(items.add(str)){
            Collections.sort(items);
            return true;
        }else{
            return false;
        }
    }

    public boolean removeAllOccurrences(String str) {
        while (items.contains(str)) {
            items.remove(str);
            return true;
        }
        return false;
    }

    public String getString(int index) {
        if(items.size()<index){
            return null;
        }else {
            return items.get(index);
        }
    }

    public int noOfElements() {
        return items.size();
    }
}