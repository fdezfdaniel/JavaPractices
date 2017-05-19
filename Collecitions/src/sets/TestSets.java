package sets;

import resources.Enums.EnumSets;

import java.util.*;

/**
 * Created by dfernandez on 18/05/2017.
 */
public class TestSets {
    public static void main(String[] args){
        testSets();
    }

    private static void testSets(){
        printSet(fillSet(EnumSets.HashSet.getSet()));
        printSet(fillSet(EnumSets.LinkedHashSet.getSet()));
        printSet(fillSet(EnumSets.TreeSet.getSet()));
    }

    private static Set fillSet(Set set){
        set.add("r");
        set.add("z");
        set.add("z");
        set.add("a");
        set.add("b");
        if (!(set instanceof TreeSet)){
            set.add(null);
        }
        return set;
    }

    private static void printSet(Set set){
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
