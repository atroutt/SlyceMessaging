package it.slyce.slyce_messaging.messenger.message;

import android.content.Context;

import it.slyce.slyce_messaging.messenger.message.messageItem.MessageItem;
import it.slyce.slyce_messaging.messenger.message.messageItem.external.media.MessageExternalMediaItem;
import it.slyce.slyce_messaging.messenger.message.messageItem.internal.media.MessageInternalMediaItem;

/**
 * Created by matthewpage on 6/21/16.
 */
public class MediaMessage extends Message {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public MessageItem toMessageItem(Context context){
        if (this.origin == MessageSource.EXTERNAL_USER)
            return new MessageExternalMediaItem(this, context);
        else
            return new MessageInternalMediaItem(this, context);
    }
}