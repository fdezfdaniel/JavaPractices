package maps;

import resources.Enums.EnumMaps;
import resources.Person;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestMaps {

    public static void main(String[] args) {
        testMaps();
    }

    private static void printMap(Map<?,?> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

    private static void testMaps() {
        printMap(fillMap(buildMap(EnumMaps.Hashtable)));
        printMap(fillMap(buildMap(EnumMaps.HashMap)));
        printMap(fillMap(buildMap(EnumMaps.LinkedHashMap)));
        printMap(fillMap(buildMap(EnumMaps.TreeMap)));
        System.out.println("-------Using object Person-------");
        printMap(fillMapPersonObject(buildMap(EnumMaps.Hashtable)));
        printMap(fillMapPersonObject(buildMap(EnumMaps.HashMap)));
        printMap(fillMapPersonObject(buildMap(EnumMaps.LinkedHashMap)));
        printMap(fillMapPersonObject(buildMap(EnumMaps.TreeMap)));
    }

    private static Map buildMap(EnumMaps type) {
        switch (type) {
            case Hashtable:
                System.out.println(EnumMaps.Hashtable.getSpecs());
                return EnumMaps.Hashtable.getMap();
            case HashMap:
                System.out.println(EnumMaps.HashMap.getSpecs());
                return EnumMaps.HashMap.getMap();
            case LinkedHashMap:
                System.out.println(EnumMaps.LinkedHashMap.getSpecs());
                return EnumMaps.LinkedHashMap.getMap();
            case TreeMap:
                System.out.println(EnumMaps.TreeMap.getSpecs());
                return EnumMaps.TreeMap.getMap();
        }
        return Collections.emptyMap();
    }

    private static Map<String, String> fillMap(Map map) {
        map.put("r", "r");
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        if (!(map instanceof Hashtable) && !(map instanceof TreeMap)) {
            map.put("z", null);
            map.put(null, null);
        }
        return map;
    }

    private static Map<Person, Person> fillMapPersonObject(Map<Person, Person> map){
        Person dad = new Person();
        dad.setFirstName("Homer");
        dad.setMiddleName("J.");
        dad.setLastName("Simpson");
        dad.setAddress("742 Evergreen Terrace");
        Person mom = new Person();
        mom.setFirstName("Marjorie");
        mom.setLastName("Bouvier Simpson");
        Person son = new Person();
        son.setFirstName("Bartholomew");
        son.setMiddleName("J.");
        son.setLastName("Simpson");
        map.put(mom,mom);
        map.put(dad,dad);
        map.put(son,son);
        return map;
    }
}
