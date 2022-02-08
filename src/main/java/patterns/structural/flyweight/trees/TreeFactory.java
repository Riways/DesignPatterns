package patterns.structural.flyweight.trees;

import java.util.HashMap;
import java.util.Map;
import java.awt.*;

public class TreeFactory {
static Map<String, TreeType> treeTypes = new HashMap<String, TreeType>();

public static TreeType getTreeType(String name, Color color) {
    TreeType result = treeTypes.get(name);
    if (result == null) {
        result = new TreeType(name, color);
        treeTypes.put(name, result);
    }
    return result;
}
}
