package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record System(
        String body,
        String identity,
        String new_wa_id,
        String wa_id,
        SystemType type,
        String customer
) {
}
