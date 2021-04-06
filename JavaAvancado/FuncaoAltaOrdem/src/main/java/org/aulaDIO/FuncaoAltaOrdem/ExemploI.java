package org.aulaDIO.FuncaoAltaOrdem;

import java.util.function.Supplier;

// Exemplo API - Paradigma Funcional
public class ExemploI {
    public static void main(String[] args){
        Calculo SOMA = (a, b) -> a + b;
        Calculo DIVISAO = (a, b) -> a / b;
        Calculo MULTIPLICACAO = (a, b) -> a * b;
        Calculo SUBTRACAO = (a, b) -> a - b;

        System.out.println(executarOperacao(SOMA, 1,3)); // 4
        System.out.println(executarOperacao(SUBTRACAO, 4,3)); //1
        System.out.println(executarOperacao(MULTIPLICACAO, 15,3)); // 45
        System.out.println(executarOperacao(DIVISAO, 15,3)); // 5
//  Usando Supridores:
//        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa = Pessoa::new;
        System.out.println(instanciaPessoa.get());
    }
    // Função de Alta Ordem, pois recebe outra função como parâmetro (neste caso a outra função é a interface funcional Calculo
    public static int executarOperacao(Calculo calculo, int a, int b){ return calculo.calculo(a, b); }
}

@FunctionalInterface
interface Calculo{
    public int calculo(int a, int b);
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Silas";
        idade = 22;
    }

//    Para poder visualizar os dados é preciso converter os dados do objeto em uma String, pois se isso não for
//    feito, ao pedir que o System.out.println() imprima esses dados na tela essa função irar procurar por uma forma
//    de apresentar os dados de uma classe, na classe Object, do qual possui, mas de forma confusa! (Forma padrão do JAva para imprimir um objeto)
    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}

