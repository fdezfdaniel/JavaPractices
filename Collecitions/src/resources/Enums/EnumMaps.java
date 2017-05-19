package resources.Enums;

import java.util.Map;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by dfernandez on 18/05/2017.
 */
public enum EnumMaps {
    Hashtable {
        @Override
        public Map getMap() {
            return new Hashtable();
        }

        @Override
        public String getSpecs() {
            return "Hashtable: It doesn't allow null key neither null values. Not ordered. Not sorted.";
        }
    },
    HashMap {
        @Override
        public Map getMap() {
            return new HashMap();
        }

        @Override
        public String getSpecs() {
            return "HashMap: It allows null key and null values. Not ordered. Not sorted.";
        }
    },
    LinkedHashMap {
        @Override
        public Map getMap() {
            return new LinkedHashMap();
        }

        @Override
        public String getSpecs() {
            return "LinkedHashMap: It allows null key and null values. It's ordered by insertion order. Not sorted.";
        }
    },
    TreeMap {
        @Override
        public Map getMap() {
            return new TreeMap();
        }

        @Override
        public String getSpecs() {
            return "TreeMap: It doesn't allow null key, allows null values. Not ordered.  Sorted by natural order or custom rules.";
        }
    };

    public abstract Map getMap();

    public abstract String getSpecs();
}
