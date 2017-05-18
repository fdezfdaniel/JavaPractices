package maps;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestMaps {

    public static void main(String[] args) {
        testMaps();
    }

    private static void printMaps(Map<String, String> mapa) {
        for (Map.Entry entry : mapa.entrySet()) {
            System.out.println("llave: " + entry.getKey() + " valor: " + entry.getValue());
        }
    }

    private static void testMaps() {
        printMaps(fillMaps(buildMaps(EnumMaps.HashMap)));
        printMaps(fillMaps(buildMaps(EnumMaps.Hashtable)));
        printMaps(fillMaps(buildMaps(EnumMaps.LinkedHashMap)));
        printMaps(fillMaps(buildMaps(EnumMaps.TreeMap)));
    }

    private static Map buildMaps(EnumMaps type) {
        switch (type) {
            case Hashtable:
                System.out.println(EnumMaps.Hashtable.getCaracteristicas());
                return EnumMaps.Hashtable.getMap();
            case HashMap:
                System.out.println(EnumMaps.HashMap.getCaracteristicas());
                return EnumMaps.HashMap.getMap();
            case LinkedHashMap:
                System.out.println(EnumMaps.LinkedHashMap.getCaracteristicas());
                return EnumMaps.LinkedHashMap.getMap();
            case TreeMap:
                System.out.println(EnumMaps.TreeMap.getCaracteristicas());
                return EnumMaps.TreeMap.getMap();
        }
        return Collections.emptyMap();
    }

    private static Map fillMaps(Map mapa) {
        mapa.put("r", "r");
        mapa.put("a", "a");
        mapa.put("b", "b");
        mapa.put("c", "c");
        mapa.put("d", "d");
        if (!(mapa instanceof Hashtable) && !(mapa instanceof TreeMap)) {
            mapa.put("z", null);
            mapa.put(null, null);
        }
        return mapa;
    }
}
