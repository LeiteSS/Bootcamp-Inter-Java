package org.aulaDIO.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SegundoExemplo {
    public static void main(String[] args){
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(11);
        sequenciaNumerica.add(13);
        System.out.println(sequenciaNumerica);
        // Remove item do LinkedHashSet
        sequenciaNumerica.remove(1);
        System.out.println(sequenciaNumerica);
        // Retorna a quantidade de itens do Set
        System.out.println(sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }

        System.out.println(sequenciaNumerica.isEmpty());
    }
}
