package br.ufrn.imd.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que armazena os critérios quantidade de requisições que serão solicitadas
 */
public class NumberResquests {
    public Map<Integer,Integer> QTD_REQUESTS;

    public NumberResquests(){
        this.QTD_REQUESTS = new HashMap<>();
        QTD_REQUESTS.put(1,10);
        QTD_REQUESTS.put(2,100);
        QTD_REQUESTS.put(3,300);
        QTD_REQUESTS.put(4,500);
        QTD_REQUESTS.put(5,800);
        QTD_REQUESTS.put(6,1000);
        QTD_REQUESTS.put(7,1500);
    }

    public Map<Integer, Integer> getQTD_REQUESTS() {
        return QTD_REQUESTS;
    }
}
