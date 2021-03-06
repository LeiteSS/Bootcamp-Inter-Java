package com.teste;

import static org.mockito.Mockito.mock;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();

        int soma = calc.somar("1+1+3");
        assertEquals(05, soma);
    }

    @Test
    public void testeSomarComMock() {
        // Mockar é util quando é preciso testar uma aplicação que possui conexão com banco de
        // dados, porém o programador não está conectado com o banco de dados ainda
        Calculadora calculadora = mock(Calculadora.class);
        when(calculadora.somar("1+2")).thenReturn(10);

        int resultado = calculadora.somar("1+2");
        assertEquals(10, resultado); // Forçou a passar no teste
    }
}
