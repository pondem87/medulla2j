package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Image(
        String caption,
        String sha256,
        String id,
        String mime_type
) {
}
