package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Location(
        String address,
        double latitude,
        double longitude,
        String name
) {
}
