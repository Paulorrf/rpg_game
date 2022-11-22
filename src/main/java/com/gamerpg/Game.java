package com.gamerpg;

import java.util.Random;
import java.util.Scanner;

public class Game {

    void fightMonster(Guerreiro player, Monster monster) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        while (player.HP > 0 && monster.HP > 0) {
            System.out.println("Vida do " + monster.race + ": " + monster.HP);

            System.out.println("O que você deseja fazer? ");
            System.out.println("atacar, defender, fugir ou usar magia? ");
            String action = scanner.nextLine();
            int damageDealtByPlayer;

            // ação do jogador
            switch (action) {
                case "atacar":
                    damageDealtByPlayer = player.ataqueFisico();
                    monster.HP -= damageDealtByPlayer;
                    System.out.println("Você deu " + damageDealtByPlayer + " de dano no " +
                            monster.race);
                    System.out.println();
                    break;

                case "defender":
                    int blockChance = rand.nextInt(player.nivel + monster.nivel);
                    if (blockChance > player.nivel) {
                        // System.out.println("Você não conseguiu bloquear");
                        // player.setHP(monster.nivel * monster.forca - 1);
                        System.out.println("Sua vida é " + player.HP);
                    } else {
                        System.out.println("Você conseguiu bloquear");
                    }
                    break;

                case "fugir":
                    if (player.nivel > monster.nivel) {
                        System.out.println("você conseguiu fugir");
                    } else {
                        System.out.println("voce nao conseguiu fugir");
                    }
                    break;

            }
            System.out.println();

            // ação do monstro
            System.out.println("O " + monster.race + " está atacando");
            boolean acertou = rand.nextInt(monster.chanceDeAcerto) >= 4 ? true : false;
            if (acertou) {
                System.out.println("O " + monster.race + " acertou o ataque");
                player.HP -= monster.ataqueFisico();
                System.err.println("Você perdeu " + monster.ataqueFisico() + " de vida e tem " + player.HP);
            } else {
                System.out.println("O " + monster.race + " errou o ataque");
            }

            System.out.println();
        }
        // scanner.close();
    }
}
