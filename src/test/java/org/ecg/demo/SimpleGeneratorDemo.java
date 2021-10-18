package org.ecg.demo;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
class SimpleGeneratorDemo {

    @Test
    void this_test_should_be_true() {
        assertEquals("Hello World", "Hello World");
    }
}
