package sets;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by dfernandez on 18/05/2017.
 */
public class TestSets {
    public static void main(String[] args){
        Set set = new LinkedHashSet();
        set.add(null);
        set.add("z");
        set.add("r");
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
    }


}
