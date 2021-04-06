package org.aulaDIO.lista;

import java.util.List;
import java.util.Vector;

public class SegundoExemplo {
    public static void main(String[] args){
        List<String> esportes = new Vector<>();
        // Adiciona alguns esportes no Vector
        esportes.add("Futebol");
        esportes.add("Rugby");
        esportes.add("Golf");
        esportes.add("Xadrez");
        esportes.add("Formula One");

        // Altera o elemento no indice 1 - que é o Rugby
        esportes.set(1, "Futebol Americano");

        // Remove o elemento no indice 2 - que é o Golf
        esportes.remove(2);

        // Remove o esporte Formula One
        esportes.remove("Formula One");

        // Retorna o primeiro elemento do vetor
        System.out.println(esportes.get(0));

        // Navega no vetor
        for (String esporte: esportes) {
            System.out.println("Eu jogo " +esporte+ "?");
        }
    }
}
