package com.pfitztronic.medulla2j.webhooks.services;

import com.pfitztronic.medulla2j.webhooks.dtos.messages.Messages;
import com.pfitztronic.medulla2j.webhooks.dtos.change.MessagesChange;
import com.pfitztronic.medulla2j.webhooks.dtos.WhatsAppWebhookPayload;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WhatsAppService {
    public ResponseEntity<List<Messages>> processWhatsAppWebhook(WhatsAppWebhookPayload payload) {
        List<Messages> messages = new ArrayList<>();

        payload.entry().forEach(entry -> {
            entry.changes().forEach(change -> {
                if (change.getField().equals("messages")) {
                    MessagesChange messagesChange = (MessagesChange) change;
                    messages.addAll(messagesChange.getValue().messages());
                }
            });
        });

        return ResponseEntity.ok().body(messages);
    }
}
