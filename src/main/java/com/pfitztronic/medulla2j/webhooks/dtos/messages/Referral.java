package com.pfitztronic.medulla2j.webhooks.dtos.messages;

public record Referral(
        String source_url,
        String source_type,
        String source_id,
        String headline,
        String body,
        String media_type,
        String image_url,
        String video_url,
        String thumbnail_url,
        String ctwa_clid
) {
}
