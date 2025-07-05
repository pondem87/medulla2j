package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record ProductItem(
        String product_retailer_id,
        String quantity,
        String item_price,
        String currency
) {
}
