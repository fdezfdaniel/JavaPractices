package sets;

import resources.Enums.EnumSets;
import resources.pojos.Dog;

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
        System.out.println("---------Fill set with objects");
        printSet(fillSetDogObject(EnumSets.HashSet.getSet()));
        printSet(fillSetDogObject(EnumSets.LinkedHashSet.getSet()));
        printSet(fillSetDogObject(EnumSets.TreeSet.getSet()));
    }

    private static Set fillSet(Set<String> set){
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

    private static Set fillSetDogObject(Set set){
        Dog max = new Dog();
        max.setName("Maximilian");
        max.setAlias("Max");
        max.setSex("Male");
        max.setId(1);
        Dog lucy = new Dog();
        lucy.setName("Lucy");
        lucy.setAlias("lucy");
        lucy.setId(2);
        lucy.setSex("Female");
        set.add(lucy);
        set.add(lucy);
        set.add(lucy);
        set.add(lucy);
        set.add(max);
        Dog rocky = new Dog();
        rocky.setId(3);
        rocky.setName("Rocky");
        rocky.setSex("Male");
        set.add(rocky);
        Dog max2 = new Dog();
        max2.setName("Maximilian");
        max2.setAlias("Max");
        max2.setSex("Male");
        max2.setId(1);
        set.add(max2);
        return set;
    }

}
