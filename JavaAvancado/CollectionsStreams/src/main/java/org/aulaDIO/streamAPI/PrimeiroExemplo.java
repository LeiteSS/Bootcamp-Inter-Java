package org.aulaDIO.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
// Comentar a linha Ctrl + /
public class PrimeiroExemplo {
    public static void main(String[] args){
        List<String> estudantes = new ArrayList<>();

        // Adicionando Strings ao objeto Array seguindo esta ordem: Carlos, José, Pedro, Anderson, Augusto e Benjamim
        estudantes.add("Carlos");
        estudantes.add("José");
        estudantes.add("Pedro");
        estudantes.add("Anderson");
        estudantes.add("Augusto");
        estudantes.add("Benjamin");
        // Retorna a contagem de elementos de um stream
        System.out.println("Contagem: " +estudantes.stream().count());
        // Retorna o estudante com o maior numero de letras
        System.out.println("Maior numero de Letras: "+estudantes.stream().max(Comparator.comparingInt(String::length)));
        // Retorna o estudante com o menor numero de letras
        System.out.println("Menor numero de Letras: "+estudantes.stream().min(Comparator.comparingInt(String::length)));
        // Retorna o Elemento que tem R no nome
        System.out.println("Com a letrar 'R' no nome: "+ estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        // Retorna uma nova coleção, com os nomes concatenados com a quantidade de letras que cada nome possui
        System.out.println("Retorna uma nova coleção: "+estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        // Retorna os três primeiros elementos
        System.out.println("Retorna os três primeiros elementos da coleção: " +estudantes.stream().limit(3).collect(Collectors.toList()));
        // Exibe cada elemento no console, depois retorna a mesma coleção
        System.out.println("Retorna a coleção: " +estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        // Exibe cada elemento no console, sem retorna outra coleção
        System.out.println("Retorna os elementos novamente:");
        estudantes.stream().forEach(System.out::println);
        // Retorna true se todos os nomes tiverem a letra A no nome
        System.out.println("Tem a letra A? " +estudantes.stream().allMatch((elemento) -> elemento.contains("A")));
        // Retorna true se algum nome tiver a letra e minuscula
        System.out.println("Tem a letra e minuscula no nome? " +estudantes.stream().anyMatch((elemento) -> elemento.contains("e")));
        // Retorna true se nenhum elemento tive a letra y no nome
        System.out.println("Não tem nenhum nome com a letra y? " +estudantes.stream().noneMatch((elemento) -> elemento.contains("y")));
        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        // Exemplo de operação encadeada
        System.out.println("Operação Encadeada:");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter((estudante) ->
                estudante.toLowerCase().contains("r"))
//        .collect(Collectors.toList()));
//        .collect(Collectors.joining(", ")));
//        .collect(Collectors.toSet()));
        .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));




    }
}
