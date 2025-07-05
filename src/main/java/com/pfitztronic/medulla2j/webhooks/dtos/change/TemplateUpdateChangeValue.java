package com.pfitztronic.medulla2j.webhooks.dtos.change;

public record TemplateUpdateChangeValue(
        TemplateEvent event,
        String message_template_id,
        String message_template_name,
        String message_template_language,
        String reason,
        DisableInfo disable_info,
        OtherInfo other_info
) { }
