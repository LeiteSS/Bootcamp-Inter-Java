package org.aulaDIO.optionals;

import java.util.Optional;

public class PrimeiroExemplo {
    public static void main(String[] args){
        // Estado Presente
        Optional<String> optionalString = Optional.of("Valor Presente");
        System.out.println("Valor Opcional Que Está Presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("O valor não está presente"));
        // Estado Vazio
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor Opcional Que é Nulo");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nulo"));

        Optional<String> emptyptional = Optional.empty();
        System.out.println("Valor Opcional Que Está Vazio");
        emptyptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = vazio"));

        Optional<String> errorOptional = Optional.of(null);
        System.out.println("Forma Errada de Usar o Optional Para Valores Vazios- Erro: NullPointerExceptions");
        errorOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Erro: vazio"));
    }
}
