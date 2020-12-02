package com.restspring.pedromateus.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");

   private final String description;

    PhoneType(String description) {
        this.description = description;
    }
}
