package br.ufrn.imd.service;

import br.ufrn.imd.domain.BoredQuote;
import org.springframework.web.client.RestTemplate;

/**
 * Classe que tem o objetivo de consumir a api selecionada, e recuperar a resposta em forma de JSON.
 *
 */
public class ConsumerBored {
    private RestTemplate restTemplate;

    public ConsumerBored(){
         this.restTemplate = new RestTemplate();
    }
    /**
     * Método que requisita a api e recebe a resposta em formato de json.
     *
     */
    public void run(){
        BoredQuote boredQuote = restTemplate.getForObject(
                "https://www.boredapi.com/api/activity",BoredQuote.class);
        System.out.println(boredQuote.toString());
    }
}
