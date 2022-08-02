package factory;

import designmode.factory.Coffee;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ConfigFactory {
    private static Map<String, Coffee> map = new HashMap<>();
    static {
        Properties properties = new Properties();
        InputStream in = ConfigFactory.class.getClassLoader().getResourceAsStream("config.properties");

        try {
            properties.load(in);
            Set<Object> keys = properties.keySet();
            for (Object key:
                 keys) {
                String className = properties.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = ((Coffee)clazz.newInstance());
                map.put((String) key,coffee);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
