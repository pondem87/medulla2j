package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Interactive(
        InteractiveType type,
        ButtonReply button_reply,
        ListReply list_reply
) {
}
