package Classes;


public class ProgramaNumeroDePassageiros {
    public static void main(String[] args) {
        Carro carro = new Carro(6,"fiat","palio",1997);

        System.out.println("Marca do Carro: " +carro.getMarca());
        System.out.println("Modelo do Carro: " +carro.getModelo());
        System.out.println("Ano do carro: " +carro.getAno());

        carro.setVariante("Variado");
        System.out.println("Variante do carro: " +carro.getVariante());

        System.out.println("------------------------------------------");
        System.out.println("Numero de Passageiros Neste Carro: " +carro.getNumeroDePassageiros());
        System.out.println("------------------------------------------");
        var passageirosAdicionados = 2;
        System.out.println("Passageiros Adicionados: " +passageirosAdicionados);
        carro.adicionarPassageiros(passageirosAdicionados);
        System.out.println("Total de Passageiros: " +carro.getNumeroDePassageiros());
        System.out.println("------------------------------------------");
        var passageirosRemovidos = 7;
        System.out.println("Passageiros Removidos: " +passageirosRemovidos);
        carro.removerPassageiros(passageirosRemovidos);
        System.out.println("Total de Passageiros: " +carro.getNumeroDePassageiros());

        System.out.println("------------------------------------------");
        var totalDePassageiros = carro.setNumeroDePassageiros(5);
        System.out.println("Set New - Total de Passageiros: " + totalDePassageiros);

    }
}
