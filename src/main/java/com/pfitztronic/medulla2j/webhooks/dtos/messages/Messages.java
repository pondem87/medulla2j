package com.pfitztronic.medulla2j.webhooks.dtos.messages;

import com.pfitztronic.medulla2j.webhooks.dtos.Error;

import java.util.List;

public record Messages(
        Audio audio,
        Button button,
        Context context,
        Document document,
        List<Error> errors,
        String from,
        String id,
        Identity identity,
        Image image,
        Interactive interactive,
        Location location,
        Order order,
        Referral referral,
        Sticker sticker,
        System system,
        Text text,
        String timestamp,
        MessageType type,
        Video video
) {}
