package com.murin.example1;

import java.math.BigDecimal;

public class ProgressiveTaxType {
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0){
            return BigDecimal.ZERO;
        }
        if (amount.compareTo(new BigDecimal(100_000)) < 0 ) {
            return amount.multiply(new BigDecimal("0.1"));
        }
            return amount.subtract(new BigDecimal(100_000))
                    .multiply(new BigDecimal("0.15"))
                    .add(new BigDecimal(10_000));
        }
    }