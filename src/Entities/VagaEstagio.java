package Entities;

public class VagaEstagio {
    private Aluno aluno;
    private Empresa empresa;
    private Vaga vaga;
    private String dataDeInicio;


    public VagaEstagio(Aluno aluno, Empresa empresa, Vaga vaga, String dataDeInicio) {
        this.aluno = aluno;
        this.empresa = empresa;
        this.vaga = vaga;
        this.dataDeInicio = dataDeInicio;
    }

    @Override
    public String toString() {
        return "VagaEstagio{" +
                "aluno=" + aluno +
                ", empresa=" + empresa +
                ", vaga=" + vaga +
                ", dataDeInicio='" + dataDeInicio + '\'' +
                '}';
    }
}
