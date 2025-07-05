package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Context(
        Boolean forwarded,
        Boolean frequently_forwarded,
        String from,
        String id,
        ReferredProduct referred_product
) {
}
