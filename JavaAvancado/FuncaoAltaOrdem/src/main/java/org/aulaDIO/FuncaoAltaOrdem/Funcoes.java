package org.aulaDIO.FuncaoAltaOrdem;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Funcoes {
    public static void main(String[] args){
//        Usando a classe consumer
//        Consumer<String> imprimirFrase = System.out::println;
        Consumer<String> imprimirFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello World");
//        Usando a classe Function
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
//        Function<String, Integer> converterStringEmInteiro = string -> Integer.valueOf(string);
        Function<String, Integer> converterStringEmInteiro = Integer::valueOf;
        System.out.println(retornarNomeAoContrario.apply("JOOJ - SILAS - MAMACO"));
        var resultado = converterStringEmInteiro.apply("10") * 30;
        System.out.println(converterStringEmInteiro.apply("33"));
        System.out.println("Resultado da minha String + 30: " +resultado);
//        Usando a classe Predicate
//        Predicate<String> estaVazio = valor -> valor.isEmpty();
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println("O Predicato está vazio? "+estaVazio.test(""));
        System.out.println("O Predicato está vazio? "+estaVazio.test("Oi!"));
    }
}
