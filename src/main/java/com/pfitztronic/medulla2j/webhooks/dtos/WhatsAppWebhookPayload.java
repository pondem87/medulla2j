package com.pfitztronic.medulla2j.webhooks.dtos;

import java.util.List;

public record WhatsAppWebhookPayload(String object, List<Entry> entry) {}
