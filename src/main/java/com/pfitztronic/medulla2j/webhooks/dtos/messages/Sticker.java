package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Sticker(
        String mime_type,
        String sha256,
        String id,
        boolean animated
) {
}
