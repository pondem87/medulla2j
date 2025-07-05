package com.pfitztronic.medulla2j.webhooks.dtos.change;

public record TemplateQualityChangeValue (
    String previous_quality_score,
    String new_quality_score,
    String message_template_id,
    String message_template_name,
    String message_template_language
) { }
