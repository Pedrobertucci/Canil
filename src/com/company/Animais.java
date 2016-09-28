package com.company;

/**
 * Created by b_ped on 27/09/2016.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Animais {
    private String nome;
    private String raca;
    private int idade;
    private String sexo;
    private String pedigree;
    private int premiacoes;
    public  int cont=0;
    Scanner ler = new Scanner(System.in);


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public int getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(int premiacoes) {
        this.premiacoes = premiacoes;
    }

    public void cadastrar(ArrayList<Animais> a){

        System.out.printf("Nome: ");
        this.setNome(ler.next());
       /* comparaSemelhanca(getNome());*/
       /* comparaIgual(getNome(), a);*/
        System.out.printf("Raça: ");
        this.setRaca(ler.next());
        System.out.printf("Sexo (M/F): ");
        this.setSexo(ler.next());
        System.out.printf("Pedigree: ");
        this.setPedigree(ler.next());
        System.out.printf("Premiações: ");
        this.setPremiacoes(ler.nextInt());
        System.out.printf("Idade: ");
        this.setIdade(ler.nextInt());
        this.cont++;

    }

    public boolean comparaIgual(String nome, ArrayList<Animais> lista){
        int i;
        for(i=0; i < this.cont; i++){
            if(nome.equals(lista.get(i).getNome())){

                return true;
            }

        }
        if(i == this.cont){
            return false;
        }
        return  false;
    }
    public boolean comparaSemelhanca(String nome) {

        if (nome.length() < 5) {
            System.out.println("falta caracteres");

            System.out.println("Informe Outro Nome: ");
            this.setNome(ler.next());
            return false;

        } else {
            if (nome.substring(0, 5).equals(getNome().substring(0, 5))) {
                System.out.println("Nome é parecido");
                return true;
            }
        }
        return false;
    }
    public boolean comparaNome(String nome, ArrayList<Animais> animais) {
        if (nome.length() < 5) {
            System.out.println("Numero de caracteres insuficiente");
            return false;
        } else {
            for (int i=0; i < this.cont; i++){
                if (nome.substring(0, 5).equals(animais.get(i).getNome().substring(0, 5))) {
                    System.out.println("Nome parecido");
                    return false;
                }

            }
            return true;

        }
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animais other = (Animais) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", pedigree='" + pedigree + '\'' +
                ", premiacoes='" + premiacoes + '\'' +
                '}';
    }
}
