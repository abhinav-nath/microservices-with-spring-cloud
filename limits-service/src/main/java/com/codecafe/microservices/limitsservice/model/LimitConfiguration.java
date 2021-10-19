package com.codecafe.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LimitConfiguration {
    private int minimum;
    private int maximum;
}