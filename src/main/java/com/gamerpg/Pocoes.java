package com.gamerpg;

import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;

public class Pocoes {
    int nivel;
    // String type;
    String[] typesPossiveis = { "forca", "hp", "mp" };

    HashMap<String, Integer> allPocoes = new HashMap<String, Integer>();

    Pocoes(int nivel) {
        this.nivel = nivel;
        // this.type = type;
    }

    void createPocoes() {
        // forca
        allPocoes.put("forcaPeq", 2);
        allPocoes.put("forcaMed", 4);
        allPocoes.put("forcaGra", 6);

        // hp
        allPocoes.put("hpPeq", 6);
        allPocoes.put("hpMed", 12);
        allPocoes.put("hpGra", 18);

        // mp
        allPocoes.put("mpPeq", 6);
        allPocoes.put("mpMed", 12);
        allPocoes.put("mpGra", 18);
    }

    HashMap<String, Integer> createRandomPotion() {
        Random rand = new Random();
        int pocaoEscolha = rand.nextInt(typesPossiveis.length);
        HashMap<String, Integer> pocaoEscolhida = new HashMap<String, Integer>();

        this.createPocoes();
        for (Entry<String, Integer> e : allPocoes.entrySet()) {
            if (e.getKey().startsWith(typesPossiveis[pocaoEscolha])) {
                String chave = e.getKey();
                Integer valor = e.getValue();

                pocaoEscolhida.put(chave, valor);
                return pocaoEscolhida;
            }
        }
        return pocaoEscolhida;
    }
}
