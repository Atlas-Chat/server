package pro.atlaschat.server.utils;

import com.esotericsoftware.yamlbeans.YamlConfig;
import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.FileReader;
import java.util.Map;

/**
 * Created by Moritz30 on 21.12.2016.
 */
public class Settings {

    public static String ablykey = "";

    public static void load() {
        try {
            YamlReader reader = new YamlReader(new FileReader("settings.yml"));
            Object object = reader.read();
            Map map = (Map) object;
            ablykey = (String) map.get("ably_key");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
