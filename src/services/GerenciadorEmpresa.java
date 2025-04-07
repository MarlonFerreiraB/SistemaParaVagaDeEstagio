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
}

