package com.pfitztronic.medulla2j.webhooks.dtos.statuses;

public record Conversation(
        String id,
        String expiration_timestamp,
        Origin origin
) {
}
