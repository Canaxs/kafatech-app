package com.kafatech.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoMessage {
    private String message;
}
