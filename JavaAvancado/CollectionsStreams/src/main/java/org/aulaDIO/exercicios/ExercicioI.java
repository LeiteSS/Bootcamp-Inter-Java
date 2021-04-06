package org.aulaDIO.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExercicioI {
    public static void main(String[] args){
        List<String> primeiraListaDeNomes = new ArrayList<>();
        primeiraListaDeNomes.add("Juliana");
        primeiraListaDeNomes.add("Paulo");
        primeiraListaDeNomes.add("Rodrigo");
        primeiraListaDeNomes.add("André");
        primeiraListaDeNomes.add("Danilo");

        List<String> segundaListaDeNomes = new ArrayList<>();
        segundaListaDeNomes.add("Ismael");
        segundaListaDeNomes.add("Fernando");

        // Usando o metodo addAll é possivel chamar outra lista, coleção, vetor, etc
        primeiraListaDeNomes.addAll(segundaListaDeNomes);
        Collections.sort(primeiraListaDeNomes);

        for (String nome: primeiraListaDeNomes){
            System.out.println("--> "+nome);
        }
    }
}
