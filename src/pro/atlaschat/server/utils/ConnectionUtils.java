package pro.atlaschat.server.utils;

import io.ably.lib.realtime.AblyRealtime;

/**
 * Created by Moritz30 on 21.12.2016.
 */
public class ConnectionUtils {

    public static AblyRealtime ablyRealtime = null;

    public static void init() {
        initialize();
    }

    public static void initialize() {
        try {
            ablyRealtime = new AblyRealtime(Settings.ablykey);
            ablyRealtime.connection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
