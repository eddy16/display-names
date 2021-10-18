package org.ecg.demo;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
public class Indicative_Sentences_Generator_Demo {

    @Test
    void this_test_should_be_true() {
        assertEquals("Hello World", "Hello World");
    }
}
