package Entities;

public class VagaEstagio {
    private Aluno aluno;
    private Empresa empresa;
    private String dataDeInicio;


    public VagaEstagio(Aluno aluno, Empresa empresa, String dataDeInicio) {
        this.aluno = aluno;
        this.empresa = empresa;
        this.dataDeInicio = dataDeInicio;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "VagaEstagio{" +
                "aluno=" + aluno +
                ", empresa=" + empresa +
                ", dataDeInicio='" + dataDeInicio + '\'' +
                '}';
    }
}
