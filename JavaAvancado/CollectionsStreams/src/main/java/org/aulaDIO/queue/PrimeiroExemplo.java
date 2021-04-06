package org.aulaDIO.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PrimeiroExemplo {
    public static void main(String[] args){
        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Roberto");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Mariana");
        filaDeBanco.add("João");
        filaDeBanco.add("Bruno");
        filaDeBanco.add("Marta");

        System.out.println(filaDeBanco);

        // O metodo poll remove o primeiro elemento da fila
        var clienteASerAtendido = filaDeBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);
        // Retorna o primeiro cliente, mas não remove-o
        var primeiroCliente = filaDeBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);

        for (String cliente: filaDeBanco){
            System.out.println(cliente);
        }
        Iterator<String> iteratorFilaBanco = filaDeBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("-->"+iteratorFilaBanco.next());
        }
        System.out.println(filaDeBanco.size());
        System.out.println(filaDeBanco.isEmpty());

        // Limpa a fila
        filaDeBanco.clear();
        // Retorna null, pois não há elementos na fila
        System.out.println(filaDeBanco.poll());
        // Retorna um erro, pois não há elementos na fila
        var primeiroClienteOuErro = filaDeBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaDeBanco);

    }
}
