package org.aulaDIO.lista;
// classes que serão importadas para ser necessario trabalhar com Listas
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrimeiroExemplo {
    public static void main(String[] args){
        List<String> nome = new ArrayList<>();

        // Adicionando Strings ao objeto Array seguindo esta ordem: Carlos, José, Pedro, Anderson, Augusto e Benjamim
        nome.add("Carlos");
        nome.add("José");
        nome.add("Pedro");
        nome.add("Anderson");
        nome.add("Augusto");
        nome.add("Benjamin");

        System.out.println(nome);
        // Trabalhando com Lista usando o for
        for (String elemento: nome){
            System.out.println("-->" +elemento);
        }
        // Trabalhando com Listas usando o interator e while
        Iterator<String> iterator = nome.iterator();
        while (iterator.hasNext()){
            System.out.println("- " +iterator.next());
        }
        // Adicionando o nome Larissa à posição 2; e consequentemente, removendo o nome Pedro
        nome.set(2, "Larissa");
        System.out.println(nome);
        // Ordenando os nomes em ordem alfabetica
        Collections.sort(nome);
        System.out.println(nome);
        // Removendo o nome José usando o Index - Lembre-se que a ordem foi mudada usando Collections.sort
        nome.remove(4);
        System.out.println(nome);
        // Retorna a posição de um determinado elemento, neste caso usando uma String
        var posicao = nome.indexOf("Larissa");
        System.out.println(posicao);
        // Removendo o nome usando a String
        nome.remove("Larissa");
        System.out.println(nome);
        // Retorna a String ou elemento salvo em um determinado indice
        String augusto = nome.get(1);
        System.out.println(augusto);
        // Usado para saber o tamanho de uma lista
        var tamanho = nome.size();
        System.out.println(tamanho);
        // Retorna se determinado elemento existe na lista
        var contemAugusto = nome.contains("Augusto");
        System.out.println(contemAugusto);
        var contemFernando = nome.contains("Fernando");
        System.out.println(contemFernando);
        // Retorna se a false para lista com elementos e true para lista sem elementos
        var aListaEstaVazia = nome.isEmpty();
        System.out.println(aListaEstaVazia);
        // nome.clear() limpa lista e entao retorna true para lista fazia
        nome.clear();
        var aListaEsvaziou = nome.isEmpty();
        System.out.println(aListaEsvaziou);
    }

}
