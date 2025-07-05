package com.pfitztronic.medulla2j.webhooks.dtos.change;

import com.pfitztronic.medulla2j.webhooks.dtos.Error;
import com.pfitztronic.medulla2j.webhooks.dtos.statuses.Statuses;
import com.pfitztronic.medulla2j.webhooks.dtos.messages.Messages;

import java.util.List;

public record MessagesChangeValue (
        String messaging_product,
        Metadata metadata,
        List<Contact>contacts,
        List<Error> errors,
        List<Messages> messages,
        List<Statuses> statuses
) { }
