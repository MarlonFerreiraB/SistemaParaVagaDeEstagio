package services;

import Entities.Aluno;
import Entities.Empresa;
import Entities.VagaEstagio;
import services.GerenciadorEmpresa;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorVagas {
    GerenciadorEmpresa gerenciadorEmpresa = new GerenciadorEmpresa();
    List<VagaEstagio> listaVagaEstagio = new ArrayList<>();

    public boolean addVaga(Aluno aluno, Empresa empresa , String dataDeInicio){
        for(VagaEstagio v : listaVagaEstagio){
            if(v.getAluno() == aluno && v.getEmpresa() == empresa){
                System.out.println("O aluno ja esta escrito nessa Vaga");
                return false;
            }
        }
        listaVagaEstagio.add(new VagaEstagio(aluno, empresa, dataDeInicio));
        gerenciadorEmpresa.removerEmpresa(empresa.getName(), null);
        System.out.println("Aluno cadastrado para essa vaga!");
        return true;
    }
}


