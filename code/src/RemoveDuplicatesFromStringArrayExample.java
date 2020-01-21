import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class RemoveDuplicatesFromStringArrayExample {
 
    public static void main(String[] args) {
        
    	String str = "Hello How Are You Doing How Do You Do";
        String[] arrOfStr = str.split(" ");
        LinkedHashSet<String> lhSet = new LinkedHashSet<String>(Arrays.asList(str));
        String[] newArray = lhSet.toArray(new String[lhSet.size()]);
        System.out.println("Array after removing duplicates: " 
                + Arrays.toString(newArray));
 
    }
}