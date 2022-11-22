package com.gamerpg;

public class Mago extends Classes {
    String classe = "mago";

    String[] magias = { "bola de fogo", "flecha de gelo" };

    Mago() {
        setForca(2);
        setAgilidade(4);
        setInteligencia(10);
        setHP(60);
        setMP(50);
        setWeapon("cajado");
    }

    int useMagic(int option) {
        if (option == 1) {
            System.out.println("Você usou " + magias[0]);
            this.MP -= 4;
            return 12;
        } else if (option == 2) {
            System.out.println("Você usou " + magias[1]);
            this.MP -= 2;
            return 8;
        } else {
            System.out.println("Voce selecionou a magia errada!");
            return 0;
        }
    }

    void magiasDisponiveis() {
        System.out.print("Voce pode usar estas magias: ");
        for (String magia : magias) {
            System.out.print(magia + " ");
        }
        System.out.println();
    }

}
