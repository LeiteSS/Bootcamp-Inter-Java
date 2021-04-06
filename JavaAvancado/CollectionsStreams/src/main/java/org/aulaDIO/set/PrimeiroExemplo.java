package org.aulaDIO.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrimeiroExemplo {
    public static void main(String[] args){
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(9.0);
        notasAlunos.add(8.0);
        notasAlunos.add(6.5);
        notasAlunos.add(7.5);
        notasAlunos.add(10.0);
        System.out.println(notasAlunos);
        // Remove notas do set
        notasAlunos.remove(5.8);
        System.out.println(notasAlunos);
        // Retorna a quantidade dos itens do set
        System.out.println(notasAlunos.size());
        // Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Double nota: notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());
    }
}
