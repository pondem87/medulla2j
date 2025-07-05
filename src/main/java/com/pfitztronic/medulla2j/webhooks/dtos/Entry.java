package com.pfitztronic.medulla2j.webhooks.dtos;

import com.pfitztronic.medulla2j.webhooks.dtos.change.Change;

import java.util.List;

public record Entry(
        String id,
        List<Change> changes
) {
}
