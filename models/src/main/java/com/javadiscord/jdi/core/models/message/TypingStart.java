package com.javadiscord.jdi.core.models.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.javadiscord.jdi.core.models.user.Member;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TypingStart(
        @JsonProperty("channel_id") long channelId,
        @JsonProperty("guild_id") long guildId,
        @JsonProperty("user_id") long userId,
        @JsonProperty("timestamp") int timestamp,
        @JsonProperty("member") Member member) {}
