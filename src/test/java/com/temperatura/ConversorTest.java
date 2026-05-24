package com.temperatura;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTest {

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0.0, Conversor.fahrenheitParaCelsius(32), 0.001);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32.0, Conversor.celsiusParaFahrenheit(0), 0.001);
    }

    @Test
    public void testFahrenheitParaCelsius212() {
        assertEquals(100.0, Conversor.fahrenheitParaCelsius(212), 0.001);
    }
}