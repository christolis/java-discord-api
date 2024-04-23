package com.javadiscord.jdi.internal.models.scheduledevent;

import com.javadiscord.jdi.internal.models.user.Member;
import com.javadiscord.jdi.internal.models.user.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EventUser(
    @JsonProperty("guild_scheduled_event_id") long guildScheduledEventId,
    User user,
    Member member
) {}