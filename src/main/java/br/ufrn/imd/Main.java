package br.ufrn.imd;

import br.ufrn.imd.service.ConsumerBored;

public class Main {
    public static void main(String[] args) {
        ConsumerBored consumerBored = new ConsumerBored();
        for(int x=0;x<1000;x++){
            consumerBored.run();
        }
    }
}