package org.aulaDIO.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SegundoExemplo {
    public static void main(String[] args){
        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianopolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);
        // Retorna a primeira capital no topo da árvore
        System.out.println(capitais.firstKey());
        // Retorna a ultima capital no final da árvore
        System.out.println(capitais.lastKey());
        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(capitais.lowerKey("SC"));
        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(capitais.higherKey("SC"));
        // Retorna a primeira capital no topo da árvore
        System.out.println(capitais.firstEntry().getKey() + " -- " + capitais.firstEntry().getValue());
        // Retorna a ultima capital no final da árvore
        System.out.println(capitais.lastEntry().getKey() +" -- "+ capitais.lastEntry().getValue());
        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(capitais.lowerEntry("SC").getKey() +" -- "+ capitais.lowerEntry("SC").getValue());
        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(capitais.higherEntry("SC").getKey() +" -- "+ capitais.higherEntry("SC").getValue());

        Map.Entry<String, String> firstEntry = capitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();
        // Retorna a primeira capital no topo da árvore, removendo do map
        System.out.println(firstEntry.getKey() + " -- " + firstEntry.getValue());
        // Retorna a primeira capital no final da árvore, removendo do map
        System.out.println(lastEntry.getKey() +" -- "+ lastEntry.getValue());

        System.out.println(capitais);
        Iterator<String> iterator = capitais.keySet().iterator();
        while (iterator.hasNext()){
            var key = iterator.next();
            System.out.println(key +" -- "+ capitais.get(key));
        }
        for (String capital: capitais.keySet()){
            System.out.println(capital +" -- "+ capitais.get(capital));
        }
        for (Map.Entry<String, String> entry: capitais.entrySet()){
            System.out.println(entry.getKey() +" -- "+ entry.getValue());
        }

    }
}
