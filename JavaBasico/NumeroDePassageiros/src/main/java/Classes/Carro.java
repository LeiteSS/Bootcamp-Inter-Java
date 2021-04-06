package Classes;

public class Carro {
    private Integer numeroDePassageiros;
    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro (Integer numeroDePassageiros, String marca, String modelo, Integer ano){
        this.numeroDePassageiros = numeroDePassageiros;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String setVariante(String variante){
        this.variante = variante;
        return variante;
    }

    public String getVariante(){
        return variante;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }
    public Integer getAno(){
        return ano;
    }
    public Integer getNumeroDePassageiros(){
        return numeroDePassageiros;
    }

    public Integer setNumeroDePassageiros(Integer numeroDePassageiros){
        this.numeroDePassageiros = numeroDePassageiros;
        return numeroDePassageiros;
    }

    public Integer adicionarPassageiros(Integer passageirosAdicionados) {
        numeroDePassageiros = numeroDePassageiros + passageirosAdicionados;
        return numeroDePassageiros;
    }

    public Integer removerPassageiros(Integer passageirosRemovidos){
        numeroDePassageiros = numeroDePassageiros - passageirosRemovidos;
        return  numeroDePassageiros;
    }
}
