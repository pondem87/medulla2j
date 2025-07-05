package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record ReferredProduct(
        String catalog_id,
        String product_retailer_id
) {
}
