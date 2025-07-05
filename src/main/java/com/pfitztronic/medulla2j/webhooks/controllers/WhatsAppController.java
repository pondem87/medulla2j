package com.pfitztronic.medulla2j.webhooks.controllers;

import com.pfitztronic.medulla2j.webhooks.dtos.messages.Messages;
import com.pfitztronic.medulla2j.webhooks.dtos.WhatsAppWebhookPayload;
import com.pfitztronic.medulla2j.webhooks.services.WhatsAppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/whatsapp")
public class WhatsAppController {

    private final WhatsAppService whatsAppService;

    public WhatsAppController(
            WhatsAppService whatsAppService
    ) {
        this.whatsAppService = whatsAppService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String healthCheck() {
        return "Server Alive!";
    }

    @PostMapping("/webhook")
    public ResponseEntity<List<Messages>> ingestWebhook(
            @RequestBody WhatsAppWebhookPayload payload
    ) {
        return this.whatsAppService.processWhatsAppWebhook(payload);
    }
}
