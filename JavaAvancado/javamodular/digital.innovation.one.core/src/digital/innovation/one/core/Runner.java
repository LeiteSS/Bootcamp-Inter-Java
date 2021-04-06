package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Resultado da Divisão: "+calculadora.div(12, 4));
        System.out.println("Resultado da Multiplicação: "+calculadora.mult(4, 7));
        System.out.println("Resultado da Subtração: "+calculadora.sub(8, 10));
        System.out.println("Resutaldo da Soma: "+calculadora.sum(10, 20));
    }
}
