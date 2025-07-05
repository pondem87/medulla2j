package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Identity(
        boolean acknowledged,
        String created_timestamp,
        String hash
) {
}
