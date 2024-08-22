package creational_patterns.singleton;

import java.util.HashMap;
import java.util.Map;


public class ConfigManager {
    private Map<String, Object> map = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        return instance;
    }

    public String get(String key) {
        return map.get(key).toString();
    }

    public void set(String key, Object value) {
        map.put(key, value);
    }


}
