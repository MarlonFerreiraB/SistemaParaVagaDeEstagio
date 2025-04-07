package view;

import services.GerenciadorAluno;
import services.GerenciadorEmpresa;
import Entities.GerenciadorVagas;
import Entities.Vaga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();
        GerenciadorEmpresa gerenciadorEmpresa = new GerenciadorEmpresa();
        GerenciadorVagas gerenciadorVagas = new GerenciadorVagas();


        while(true){
            System.out.println("1.Cadastrar Alunos");
            System.out.println("2.Cadastrar Empresa");
            System.out.println("1.Cadastrar alunos");
            System.out.println("1.Cadastrar alunos");

            System.out.print("Escolha uma opção: ");
            int n = sc.nextInt();
            sc.nextLine();

            switch (n){
                case 1:
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Matricula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    gerenciadorAluno.addAluno(name, matricula, curso);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nameEmpresa = sc.nextLine();
                    System.out.print("cnpj: ");
                    String cnpj = sc.nextLine();
                    sc.nextLine();
                    System.out.print("quantas vagas: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    Vaga[] vaga = new Vaga[num];
                    for(int i= 0; i< vaga.length; i++){
                        System.out.print("Nome da Vaga: ");
                        String nameVaga = sc.nextLine();
                        System.out.print("Bolsa: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Carga horaria:  ");
                        int horas = sc.nextInt();
                        sc.nextLine();
                        vaga[i] = new Vaga(nameVaga, valor,horas);
                    }
                    gerenciadorEmpresa.addEmpresa(nameEmpresa,cnpj, vaga);



                case 3:
                case 4:
                case 5:
            }
        }
    }
}