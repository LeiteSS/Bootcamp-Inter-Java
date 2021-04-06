import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class inferencia { // inferencia Lambda
    public static void main(String[] args) {
        Function<Integer, Double> divisorPor2 = (var numero) -> numero / 2.0;
        System.out.println(divisorPor2.apply(8888));
        repeater();
    }

    public static void repeater() {
        // Antiga Solução
        String nome = "Silas";
        String aux = "";
        for(int i = 0; i < 10; i++) {
            aux+=nome;
        }
        System.out.println(aux);

        // Nova Solução
        System.out.println(nome.repeat(10));
    }

    public static void featureCollection() {
        List<String> nomes = Arrays.asList("joao", "Paulo", "Jose", "Mamaco"); // Antigo
        System.out.println(nomes);
        Collection<String> nomes2 = List.of("joao", "Paulo", "Jose", "Mamaco"); // Novo
        Collection<String> nomes3 = Set.of("joao", "Paulo", "Jose", "Mamaco"); // Novo
        System.out.println(nomes2);
        System.out.println(nomes3);
    }

    public static void spaceIsBlank () {
        String espaco = "                                                   ";
        System.out.println(espaco == null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' ')); // Solução Antiga
        System.out.println(espaco.isBlank()); // Solução Nova
    }

    public static void stringLine () {
        String html = "<html>\n<head>\n<head>\n <body> \n <body> \n<html>";
        System.out.println(html);
        System.out.println(html.lines().filter(s -> s.contains("head")).collect(Collectors.joining()));
        System.out.println(html.lines().map(s -> "[TAG]: " +s).collect(Collectors.joining()));
    }
}
