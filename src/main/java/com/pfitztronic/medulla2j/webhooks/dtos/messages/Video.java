package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Video(
        String caption,
        String filename,
        String sha256,
        String id,
        String mime_type
) {
}
