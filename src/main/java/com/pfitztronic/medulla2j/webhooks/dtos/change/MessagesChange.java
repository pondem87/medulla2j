package com.pfitztronic.medulla2j.webhooks.dtos.change;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessagesChange extends Change {
    private String field;
    private MessagesChangeValue value;
}
