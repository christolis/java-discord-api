package com.javadiscord.jdi.internal.api.channel;

import com.javadiscord.jdi.internal.api.DiscordRequest;
import com.javadiscord.jdi.internal.api.DiscordRequestBuilder;

import java.util.List;
import java.util.Map;

public record BulkDeleteMessagesRequest(long channelId, List<Long> messageIds)
        implements DiscordRequest {

    @Override
    public DiscordRequestBuilder create() {
        return new DiscordRequestBuilder()
                .post()
                .path("/channels/%s/messages/bulk-delete")
                .body(Map.of("messages", messageIds));
    }
}
