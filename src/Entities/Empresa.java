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
        System.out.println("Nome Empresa =" + name);
        System.out.println("CNPJ Empresa =" + cnpj);
        System.out.print("Vaga Empresa = ");
        if(vaga != null && vaga.length>0){
            for(Vaga v: vaga){
                System.out.println(v);
            }
        }
        return "Verificado";
    }

}
