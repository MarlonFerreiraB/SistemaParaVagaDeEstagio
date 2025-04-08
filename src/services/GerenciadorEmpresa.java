package services;

import Entities.Empresa;
import Entities.Vaga;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmpresa {
    List<Empresa> listaEmpresa = new ArrayList<>();

    public boolean addEmpresa(String name, String cnpj, Vaga[] vaga){
        for(Empresa e : listaEmpresa){
            if(e.getCnpj().equals(cnpj)){
                System.out.println("empresa ja cadastrada");
                return false;
            }
        }
        listaEmpresa.add(new Empresa(name, cnpj,vaga));
        System.out.println("Cadastro concluido");
        return  true;
    }

    public Object procurarEmpresa(String name){
        for(Empresa e : listaEmpresa){
            if(e.getName().equals(name)){
                System.out.println("Empresa e encontrada");
                System.out.println(e);
                return e;
            }
        }
        System.out.println("Empresa n foi encontrada");
        return null;
    }
    public boolean removerEmpresa(String name, String motivo){
        if(listaEmpresa != null && listaEmpresa.size()> 0){
            for(Empresa e : listaEmpresa){
                if(e.getName().equals(name)){
                    listaEmpresa.remove(e);
                    if(motivo != null){
                        System.out.println("Motivo: " + motivo);
                        return true;
                    }
                    else{
                        listaEmpresa.remove(e);
                        System.out.println("Motivo: não informado");
                        return false;
                    }
                }
            }
        }
        System.out.println("não tem vagas para remover");
        return false;
    }

    public void exibirVagas(){
        for(Empresa e: listaEmpresa){
            System.out.println(e);

        }
    }
}

