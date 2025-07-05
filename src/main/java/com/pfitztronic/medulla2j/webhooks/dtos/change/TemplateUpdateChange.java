package com.pfitztronic.medulla2j.webhooks.dtos.change;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TemplateUpdateChange extends Change {
    private String field;
    private TemplateUpdateChangeValue value;
}
