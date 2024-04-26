package com.javadiscord.jdi.internal.gateway.handlers.events.codec.handlers.automod;

import com.javadiscord.jdi.core.Discord;
import com.javadiscord.jdi.internal.gateway.ConnectionMediator;
import com.javadiscord.jdi.internal.gateway.handlers.events.codec.EventHandler;
import com.javadiscord.jdi.internal.models.auto_moderation.AutoModerationRule;

public class AutoModerationRuleCreateHandler implements EventHandler<AutoModerationRule> {
    @Override
    public void handle(
        AutoModerationRule event,
        ConnectionMediator connectionMediator,
        Discord discord
    ) {
        discord.getCache().getCacheForGuild(event.guildId()).add(event.id(), event);
    }
}
