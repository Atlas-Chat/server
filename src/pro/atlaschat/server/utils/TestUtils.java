package pro.atlaschat.server.utils;

import io.ably.lib.realtime.Channel;
import io.ably.lib.types.Message;

/**
 * Created by Moritz30 on 21.12.2016.
 */
public class TestUtils {

    public static void sendTest() {
        try {
            ChannelUtils.testChannel.subscribe(new Channel.MessageListener() {
                @Override
                public void onMessage(Message message) {
                    try {
                        if(!message.connectionId.equals(ConnectionUtils.ablyRealtime.connection.id)) {
                            ChannelUtils.testChannel.publish(new Message("Test", "back"));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
