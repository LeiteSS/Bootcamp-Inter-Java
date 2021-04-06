package org.aulaDIO.map;

import java.util.HashMap;
import java.util.Map;

public class PrimeiroExemplo {
    public static void main(String[] args){
        Map<String, Integer> campeosMundiaisFifa = new HashMap<>();

        // Adiciona os campeos mundias fifa no map
        campeosMundiaisFifa.put("Brasil", 5);
        campeosMundiaisFifa.put("Alemanha", 4);
        campeosMundiaisFifa.put("Italia", 4);
        campeosMundiaisFifa.put("Uruguai", 2);
        campeosMundiaisFifa.put("Argentina", 2);
        campeosMundiaisFifa.put("Franca", 1);
        campeosMundiaisFifa.put("Inglaterra", 1);
        campeosMundiaisFifa.put("Espanha", 1);

        System.out.println(campeosMundiaisFifa);
        // Atualiza o valor da chave para o Brasil
        campeosMundiaisFifa.put("Brasil", 6);
        System.out.println(campeosMundiaisFifa);
        // Retorna a Argentina
        System.out.println(campeosMundiaisFifa.get("Argentina"));
        // Retorna se existe ou não determinado campeão no map
        System.out.println(campeosMundiaisFifa.containsKey("Franca"));
        // Remove campeão e retorna se existe ou não
        campeosMundiaisFifa.remove("Franca");
        System.out.println(campeosMundiaisFifa.containsKey("Franca"));
        // Retorna se existe ou não algum hexa-campeão
        System.out.println(campeosMundiaisFifa.containsValue(6));
        // Retorna o tamanho do map
        System.out.println(campeosMundiaisFifa.size());
        // Navega nos registro do map
        for (Map.Entry<String, Integer> entry: campeosMundiaisFifa.entrySet()){
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }
        for (String key: campeosMundiaisFifa.keySet()){
            System.out.println(key + " -- "+ campeosMundiaisFifa.get(key));
        }

        campeosMundiaisFifa.clear();
        System.out.println(campeosMundiaisFifa.size());
    }
}
