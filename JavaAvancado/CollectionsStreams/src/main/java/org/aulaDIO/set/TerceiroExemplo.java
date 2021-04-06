package org.aulaDIO.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TerceiroExemplo {
    public static void main(String[] args){
        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");
        capitais.add("Porto Alegre");
        capitais.add("Salvador");
        capitais.add("Recife");

        System.out.println(capitais);
        // Retorna a capital no topo da arvoré
        System.out.println(capitais.first());
        // Retorna a ultima capital no final da arvoré
        System.out.println(capitais.last());
        // Retorna a primeira capital abaixo na arvoré da capital parametrizada
        System.out.println(capitais.lower("Belo Horizonte"));
        // Retorna a primeira capital acima na arvoré da capital parametrizada
        System.out.println(capitais.higher("Belo Horizonte"));
        // Retorna a primeira capital no topo da arvoré, removendo-o do set
        System.out.println(capitais.pollFirst());
        // Retorna a primeira capital no final da arvoré, removendo do set
        System.out.println(capitais.pollLast());

        System.out.println(capitais);
        Iterator<String> iterator = capitais.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(String capital: capitais){
            System.out.println(capital);
        }

    }
}
