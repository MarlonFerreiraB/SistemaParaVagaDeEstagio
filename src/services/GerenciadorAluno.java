package services;

import Entities.Aluno;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {
    List<Aluno> listaAluno= new ArrayList<>();

    public boolean addAluno(String name,int matricula ,String curso){
        for (Aluno a: listaAluno){
            if(a.getMatricula() == matricula){
                System.out.println("Esta matricula ja esta cadastrada");
                return false;
            }
        }

        listaAluno.add(new Aluno(name, matricula, curso));
        System.out.println("Cadastro realizado");
        return true;
    }
}
