package com.pfitztronic.medulla2j.webhooks.dtos.statuses;

public record Pricing(
        boolean billable,
        PricingCategory category,
        PricingModel pricing_model,
        PricingType type
) {
}
