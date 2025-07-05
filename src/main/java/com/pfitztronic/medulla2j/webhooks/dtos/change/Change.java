package com.pfitztronic.medulla2j.webhooks.dtos.change;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
        property = "field", // or "field", if your JSON has that
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MessagesChange.class, name = "messages"),
        @JsonSubTypes.Type(value = TemplateUpdateChange.class, name = "message_template_status_update"),
        @JsonSubTypes.Type(value = TemplateQualityChange.class, name = "message_template_quality_update"),
})
public abstract class Change  {
    public abstract String getField();
}
