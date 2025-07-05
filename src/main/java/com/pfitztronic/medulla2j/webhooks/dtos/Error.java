package com.pfitztronic.medulla2j.webhooks.dtos;

public record Error(
        int code,
        String title,
        String message,
        ErrorData error_data
) {}
