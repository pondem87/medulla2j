package com.pfitztronic.medulla2j.webhooks.dtos.change;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TemplateQualityChange extends Change {
    private String field;
    private TemplateQualityChangeValue value;
}
