package it.slyce.slyce_messaging.messenger.message.messageItem.external.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import it.slyce.slyce_messaging.R;
import it.slyce.slyce_messaging.messenger.utils.CustomSettings;
import it.slyce.slyce_messaging.messenger.message.messageItem.master.media.MessageMediaViewHolder;
import it.slyce.slyce_messaging.view.image.PicassoRoundedImageView;

/**
 * Created by John C. Hunchar on 5/16/16.
 */
public class MessageExternalMediaViewHolder extends MessageMediaViewHolder {

    public MessageExternalMediaViewHolder(View itemView, CustomSettings customSettings) {
        super(itemView, customSettings);

        this.avatarContainer = (ViewGroup) itemView.findViewById(R.id.message_scout_media_image_view_avatar_group);
        avatar = (ImageView) itemView.findViewById(R.id.message_scout_media_image_view_avatar);
        media = (PicassoRoundedImageView) itemView.findViewById(R.id.message_scout_media_picasso_rounded_image_view_media);
        timestamp = (TextView) itemView.findViewById(R.id.message_scout_media_text_view_timestamp);
        initials = (TextView) itemView.findViewById(R.id.message_scout_media_text_view_initials);
    }
}
