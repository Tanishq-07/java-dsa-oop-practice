import java.util.ArrayList;
import java.util.Arrays;

public class Leet1773 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>() ;
        items.add(new ArrayList<String>(Arrays.asList("phone","blue","pixel")));
        items.add(new ArrayList<String>(Arrays.asList("computer","silver","lenovo")));
        items.add(new ArrayList<String>(Arrays.asList("phone","gold","iphone")));
        String ruleKey = "type" ;
        String ruleValue = "phone" ;
        System.out.println(countMatches(items,ruleKey,ruleValue));

    }
    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            
            if(ruleKey=="type"&&ruleValue.equals((items.get(i)).get(0))){
                count++;
            }
            else if(ruleKey=="color"&&ruleValue.equals((items.get(i)).get(1))){
                count++;
            }
            else if(ruleKey=="name"&&ruleValue.equals((items.get(i)).get(2))){
                count++;
            }
        }
        return count;
    }
}
