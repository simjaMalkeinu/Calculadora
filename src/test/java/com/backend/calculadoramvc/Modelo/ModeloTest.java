package com.backend.calculadoramvc.modelo;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import modelo.Modelo;

public class ModeloTest {
    @Test
    public void Calcular() {
        String operacion = "3+9-8";
        Modelo modelo = new Modelo(operacion);
        modelo.calcular();
        Object result = modelo.getResult();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(4.0, result);
    }

    // @ValueSource(floats = {8.0, })
    @ParameterizedTest
    @ValueSource(strings = {
            "5+3", "12-7", "4*6", "15/3",
            "10+2*6-4", "(2+4) * (8-3)",
            "10 / (2 + 3) - (7 - 2)"
    })
    void testOperations(String argument) {
        Modelo modelo = new Modelo(argument);
        modelo.calcular();
        Object result = modelo.getResult();

        // Mapa con los resultados esperados para cada expresión
        Map<String, Object> expectedResults = new HashMap<>();
        expectedResults.put("5+3", 8.0);
        expectedResults.put("12-7", 5.0);
        expectedResults.put("4*6", 24.0);
        expectedResults.put("15/3", 5.0);
        expectedResults.put("10+2*6-4", 18.0);
        expectedResults.put("(2+4) * (8-3)", 30.0);
        expectedResults.put("10 / (2 + 3) - (7 - 2)", -3.0);

        Assertions.assertEquals(expectedResults.get(argument), result);
    }

}
