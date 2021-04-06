package org.aulaDIO.map;

import java.util.Hashtable;
import java.util.Map;

public class TerceiroExemplo {
    public static void main(String[] args){
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Pedro", 13);
        estudantes.put("Maria", 21);
        estudantes.put("Bruna", 10);
        estudantes.put("Carlos", 3);

        System.out.println(estudantes);
        estudantes.put("Bruna", 2);
        System.out.println(estudantes);

        // Remove um estudante
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        var idadeEstudantes = estudantes.get("Maria");
        System.out.println(idadeEstudantes);

        System.out.println(estudantes.size());

        // Navega nos Itens do Mapa
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() +" -- "+ entry.getValue());
        }
        for (String estudante: estudantes.keySet()){
            System.out.println(estudante +" -- "+ estudantes.get(estudante));
        }

    }
}
