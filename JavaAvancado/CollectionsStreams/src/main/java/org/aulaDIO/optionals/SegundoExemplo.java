package org.aulaDIO.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class SegundoExemplo {
    public static void main(String[] args){
        // Int
        System.out.println("Valor Inteiro Opcional:");
        OptionalInt.of(12).ifPresent(System.out::println); // 12
        // Double
        System.out.println("Valor Decimal Opcional:");
        OptionalDouble.of(12.6).ifPresent(System.out::println); // 12.6
        // Long
        System.out.println("Valor Long Opcional:");
        OptionalLong.of(23L).ifPresent(System.out::println); // 23
    }
}
