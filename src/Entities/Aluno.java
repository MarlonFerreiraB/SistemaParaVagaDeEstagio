package Entities;

public class Aluno {
    private String name;
    private int matricula;
    private String curso;

    public Aluno(String name, int matricula, String curso){
        this.name = name;
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getName(){return name;}
    public int getMatricula(){return matricula;}
    public String getCurso(){return curso;}

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
