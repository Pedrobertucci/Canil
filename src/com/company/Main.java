package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static ArrayList<Animais> animais = new ArrayList<>();
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        int opcao=0;
        int cont=0;
        do{
            System.out.println("Opacao: 1-Cadastra | 2- Lista| | 3-Deletar | 5-Sair ");
            System.out.println("***  N caes cadastrados: "+animais.size()+"| Nº Femea: "+getFemea()+"| Nº Machos: "+GetMacho()+"| Nº Premiações: "+totalPremiacoes()+"    *** ");
            System.out.printf("Opcao: ");
            opcao = ler.nextInt();
            switch (opcao){
                case 1:{
                    Animais a = new Animais();
                    a.cadastrar(animais);
                    animais.add(a);
                    System.out.println("*** CADASTRADO COM SUCESSO ***");
                    break;
                }
                case 2:{
                    int op=0;
                    System.out.println("1-Raça | 2- Nome Semelhantes | 3-Lista Pedigree");
                    op = ler.nextInt();
                    switch (op){
                        case 1:{
                            String raca;
                            System.out.printf("Raça: ");
                            raca = ler.next();

                            for (int i=0; i < animais.size(); i++ ){
                                if(animais.get(i).getRaca().equals(raca)){
                                    System.out.println("Raça: "+animais.get(i).toString());
                                }
                            }
                            break;
                        }
                        case 2:{
                            // falta aqui poxa
                            break;
                        }
                        case 3:{
                            String pedigree;
                            System.out.printf("Raça: ");
                            pedigree = ler.next();

                            for (int i=0; i < animais.size(); i++ ){
                                if(animais.get(i).getPedigree().equals(pedigree)){
                                    System.out.println("Pedigree: "+animais.get(i).toString());
                                }
                            }
                            break;
                        }
                    }

                }

                case 3:{
                    int opt=0;
                    System.out.println("Informe tipo que quer Deletar: 1- Nome semelhante| 2-Nome| 3-Por Pedigree");
                    opt = ler.nextInt();
                    switch (opt){
                        case 1:{
                            //falta semelhanteeeeeee
                        }
                        case 2:{
                        String nome;
                            System.out.printf("Nome: ");
                            nome = ler.next();
                            for (int i=0;i<animais.size(); i++){
                                if(animais.get(i).getNome().equals(nome)){
                                    animais.remove(i);

                                }
                            }
                            System.out.println("*** Caes deletados por nome com sucesso ***");
                            break;
                        }
                        case 3:{
                            String pedigree;
                            System.out.printf("Nome do Pedigree: ");
                            pedigree = ler.next();
                            for(int i=0; i < animais.size(); i++){
                                if(animais.get(i).getPedigree().equals(pedigree)){
                                    animais.remove(i);
                                }
                            }
                            System.out.println("*** Caes por pedigree deletado com sucesso*** ");
                            break;
                        }
                    }
                    break;
                }
            }

        }while (opcao != 5);

    }

    public static int getFemea(){
        int i=0;
        for(Animais a: animais){
            if(a.getSexo().toLowerCase().equals("f")){
                i++;
            }

        }
        return i;
    }

    public static int GetMacho(){
        int i=0;
        for(Animais a: animais){
            if(a.getSexo().toLowerCase().equals("m")){
                i++;
            }

        }
        return i;
    }
    public static int totalPremiacoes(){
        int recebe=0;
        for(Animais a: animais){
            recebe += a.getPremiacoes();
        }
        return recebe;
    }
}
