package aflevering3.bag;

import java.util.ArrayList;
import java.util.Collections;

public class OrderedBagWithoutRepetitions implements Bag {
    //Opretter ArrayList
    ArrayList<String> items = new ArrayList<>();

    public boolean addString(String str) {
        //Retunrer true hvis der er addet til str og anvender Collections.sort for at sortere i lexicografisk rækkefølge (Store før små bogstaver), ellers false hvis item allerede er der.
        if (items.contains(str)) {
            return false;
        } else if (items.add(str)) {
            Collections.sort(items);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAllOccurrences(String str) {
        //Så længe items.contains str fjerner vi items.remove str og returnere false og returnere true efter.
        while (items.contains(str)) {
            items.remove(str);
            return true;
        }
        return false;
    }

    public String getString(int index) {
        //Returnere det pågældene addet index. Hvis items.size() er mindre end index retunere null.
        if (items.size() < index) {
            return null;
        } else {
            return items.get(index);
        }
    }

    public int noOfElements() {
        //Returnere størrelsen af ArrayList.
        return items.size();
    }
}