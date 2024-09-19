package com.juancnuno.normalizefilterstring.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.juancnuno.normalizefilterstring.NormalizeFilterString;

public final class NormalizeFilterStringTest {

    @Test
    public void normalize() {
        // Act
        var string = NormalizeFilterString.normalize("You have a new online bill from Pacific Gas & Electric (PG&E)");

        // Assert
        assertEquals("you have a new online bill from pacific gas & electric pg&e", string);
    }
}
