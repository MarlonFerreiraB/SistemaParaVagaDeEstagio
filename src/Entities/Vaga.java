package Entities;

public class Vaga {
    private String cargo;
    private double valorDaBolsa;
    private int cargaHoraria;

    public Vaga(String cargo, double valorDaBolsa, int cargaHoraria){
        this.cargo = cargo;
        this.valorDaBolsa = valorDaBolsa;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "cargo='" + cargo + '\'' +
                ", valorDaBolsa=" + valorDaBolsa +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
