package com.pfitztronic.medulla2j.webhooks.dtos.messages;

import java.util.List;

public record Order(
        String catalog_id,
        String text,
        List<ProductItem> product_items
) {
}
