package pro.atlaschat.server.utils;

import io.ably.lib.realtime.Channel;

/**
 * Created by Moritz30 on 21.12.2016.
 */
public class ChannelUtils {

    public static Channel testChannel = null;

    public static void init() {
        testChannel = ConnectionUtils.ablyRealtime.channels.get("test");
    }

}
