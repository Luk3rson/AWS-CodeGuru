import java.util.HashMap;

public class Configuration {
    private HashMap<String, String> keyValuePairs;

    public Configuration() {
        keyValuePairs = new HashMap<String, String>();
        // load config from file
    }

    public HashMap<String, String> getValues() {
        return keyValuePairs;
    }

    public String getValue(String key) {
        if (keyValuePairs.containsKey(key))
            return keyValuePairs.get(key);
        else
            return null;
    }

    public void setValue(String key, String value) {
        if (keyValuePairs.containsKey(key))
            keyValuePairs.replace(key, value);
        else
            keyValuePairs.put(key, value);
        writerConfig();
    }
}
