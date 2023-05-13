package com.murin.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ProgressiveTaxTypeTest {
    ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
    @Test
    public void should_calculate_tax_for_values_under_100_000() {
        // given:
        BigDecimal expectedResult = BigDecimal.valueOf(100.0);

        // when:
        BigDecimal actualResult = progressiveTaxType.calculateTaxFor(BigDecimal.valueOf(1000));

        // then:
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void should_calculate_tax_for_values_over_100_000() {
        // given:
        BigDecimal expectedResult = new BigDecimal("25000.00");

        // when:
        BigDecimal actualResult = progressiveTaxType.calculateTaxFor(BigDecimal.valueOf(200000));

        // then:
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void should_return_ZERO_values_under_ZERO() {
        // given:
        BigDecimal expectedResult = BigDecimal.ZERO;

        // when:
        BigDecimal actualResult = progressiveTaxType.calculateTaxFor(BigDecimal.valueOf(-100000));

        // then:
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
