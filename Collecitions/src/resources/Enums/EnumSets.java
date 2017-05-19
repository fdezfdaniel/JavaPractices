package resources.Enums;

import java.util.*;

/**
 * Created by dfernandez on 18/05/2017.
 */
public enum EnumSets {
    HashSet("HashSet"),
    LinkedHashSet("LinkedHashSet"),
    TreeSet("TreeSet");

    private String type;

    EnumSets(String type){
        this.type = type;
        System.out.println("Doesn't allow duplicates.");
    }

    public Set getSet() {
        switch (type){
            case "HashSet":
                System.out.println("HashSet: Allow null values. Not ordered. Not sorted.");
                return new HashSet();
            case "LinkedHashSet":
                System.out.println("LinkedHashSet: Allow null values. Ordered by insertion. Not sorted");
                return new LinkedHashSet();
            case "TreeSet":
                System.out.println("TreeSet: Not allow null values. Not ordered. Sorted by natural or custom order." +
                        "Objects must implements Comparable.");
                return new TreeSet();
        }
        return Collections.EMPTY_SET;
    }
}
