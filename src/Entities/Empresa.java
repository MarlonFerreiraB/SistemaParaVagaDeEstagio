package Entities;

public class Empresa {
    private String name;
    private String cnpj;
    private Vaga[] vaga;

    public Empresa(String name, String cnpj, Vaga[] vaga){
        this.name = name;
        this.cnpj = cnpj;
        this.vaga = vaga;
    }

    public String getName() {
        return name;
    } public String getCnpj() {
        return cnpj;
    }
    public Vaga[] getVaga() {
        return vaga;
    }
    @Override
    public String toString() {
        return "Empresa{" +
                "name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", vagasDisponiveis=" + vaga +
                '}';
    }

}
