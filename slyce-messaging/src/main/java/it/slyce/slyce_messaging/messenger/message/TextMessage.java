package it.slyce.slyce_messaging.messenger.message;

import android.content.Context;

import it.slyce.slyce_messaging.messenger.message.messageItem.MessageItem;
import it.slyce.slyce_messaging.messenger.message.messageItem.external.text.MessageExternalTextItem;
import it.slyce.slyce_messaging.messenger.message.messageItem.internal.text.MessageInternalTextItem;

/**
 * Created by matthewpage on 6/21/16.
 */
public class TextMessage extends Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public MessageItem toMessageItem(Context context){
        if (this.origin == MessageSource.EXTERNAL_USER)
            return new MessageExternalTextItem(this, context);
        else
            return new MessageInternalTextItem(this, context);
    }
}