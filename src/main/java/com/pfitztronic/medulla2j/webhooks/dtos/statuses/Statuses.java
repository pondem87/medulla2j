package com.pfitztronic.medulla2j.webhooks.dtos.statuses;

import com.pfitztronic.medulla2j.webhooks.dtos.Error;

import java.util.List;

public record Statuses(
        String biz_opaque_callback_data,
        Conversation conversation,
        List<Error> errors,
        String id,
        Pricing pricing,
        String recipient_id,
        StatusType status,
        String timestamp
) {
}
