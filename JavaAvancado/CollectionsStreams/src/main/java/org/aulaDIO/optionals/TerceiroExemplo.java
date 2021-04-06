package org.aulaDIO.optionals;

import java.util.Optional;

public class TerceiroExemplo {
    public static void main(String[] args){
        Optional<String> optionalString = Optional.of("Valor Presente");
        System.out.println("O Valor está Presente? " +optionalString.isPresent()); // Contrario do metodo isEmpty()
        System.out.println("O Valor está Vazio? "+optionalString.isEmpty()); // Contrario do metodo isPresent()
        optionalString.ifPresent(System.out::println);
        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor Vazio"));

        if (optionalString.isPresent()) {
            var valor = optionalString.get();
            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
        optionalString.orElseThrow(IllegalStateException::new); // Lança uma exceção caso o Optional esteja vazio

    }
}
