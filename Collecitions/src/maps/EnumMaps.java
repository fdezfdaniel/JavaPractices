package maps;

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
        public String getCaracteristicas() {
            return "Hashtable: No permite llave ni valor nulos. No tiene orden de inserción ni se puede ordenar";
        }
    },
    HashMap {
        @Override
        public Map getMap() {
            return new HashMap();
        }

        @Override
        public String getCaracteristicas() {
            return "HashMap: Permite que su llave y/o su valor sean nulos. No tiene orden de inserción ni se puede ordenar";
        }
    },
    LinkedHashMap {
        @Override
        public Map getMap() {
            return new LinkedHashMap();
        }

        @Override
        public String getCaracteristicas() {
            return "LinkedHashMap: Permite que su llave y/o su valor sean nulos. Tiene orden de inserción, no se puede ordenar\"";
        }
    },
    TreeMap {
        @Override
        public Map getMap() {
            return new TreeMap();
        }

        @Override
        public String getCaracteristicas() {
            return "TreeMap: No permite que su llave sea nula, permite que su valor sea nulo. No tiene orden de inseción. " +
                    "Se puede usar un orden natural o uno custom";
        }
    };

    public abstract Map getMap();

    public abstract String getCaracteristicas();
}
