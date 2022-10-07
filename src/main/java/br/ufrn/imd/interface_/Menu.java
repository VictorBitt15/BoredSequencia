package br.ufrn.imd.interface_;

import br.ufrn.imd.service.ConsumerBored;
import br.ufrn.imd.util.NumberResquests;
import java.util.Scanner;

/**
 * Classe que representa a interação com os usuário e faz a chamada da classe consumidora da api
 */
public class Menu implements IMenu{
    public NumberResquests numberResquests;

    public Menu(){
        System.out.println("Client iniciado");
        this.numberResquests = new NumberResquests();
        new MenuOptions().start();
    }
    private class MenuOptions extends Thread{

        public void run() {
            Scanner sc = new Scanner(System.in);
            while(true){
                String operacao;
                operacao= CreateMenu();
                switch(operacao){
                    case "0":
                    case "":
                        System.exit(0);
                }
                int qtdRequest = numberResquests.getQTD_REQUESTS().get(Integer.parseInt(operacao));
                ConsumerBored consumerBored = new ConsumerBored();
                long tempo_inicial = System.nanoTime();
                for(int x=0;x<qtdRequest;x++){
                    consumerBored.run();
                }
                long tempo_final = System.nanoTime();
                double result= (tempo_final-tempo_inicial)/1000000;
                System.out.println("Tempo percorrido total: "+result+"ms");
            }
        }
    }
    @Override
    public String CreateMenu() {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("---------------");
        System.out.println("Digite a quantidade de requisições desejada:");
        System.out.println("1 - 10 Requisições");
        System.out.println("2 - 100 Requisições");
        System.out.println("3 - 300 Requisições");
        System.out.println("4 - 500 Requisições");
        System.out.println("5 - 800 Requisições");
        System.out.println("6 - 1000 Requisições");
        System.out.println("7 - 1500 Requisições");
        System.out.println("0 - Sair");
        System.out.println("---------------");
        System.out.print("Operação: ");*/
        String operacao = sc.nextLine();
        return operacao;
    }
}
