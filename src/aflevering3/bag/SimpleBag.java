package aflevering3.bag;

import java.util.ArrayList;

public class
SimpleBag implements Bag{
    //Opretter ArrayList.
    ArrayList<String> items = new ArrayList<>();

    public boolean addString(String str) {
        //Retunrer true hvis der er addet til str.
        if (items.add(str)){
            return true;
        }else{
            return false;
        }
    }

    public boolean removeAllOccurrences(String str) {
        //Bruger ikke og returnere false.
        return false;
    }

    public String getString(int index) {
        //Returnere det pågældene addet index. Hvis items.size() er mindre end index retunere null.
        if(items.size()<index){
            return null;
        }else {
            return items.get(index);
        }
    }

    public int noOfElements() {
        //Returnere størrelsen af ArrayList.
        return items.size();
    }
}
