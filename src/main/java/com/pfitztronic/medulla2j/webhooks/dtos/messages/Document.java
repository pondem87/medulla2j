package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Document(
        String caption,
        String filename,
        String sha256,
        String mime_type,
        String id
) {
}
