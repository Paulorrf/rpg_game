package com.gamerpg;

import java.util.Random;
import java.util.Scanner;

public class Game {

    void fightMonster(Guerreiro player, Monster monster) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        double damageDealtByPlayer;
        boolean playerDefendeu = false;

        while (player.HP > 0 && monster.HP > 0) {
            System.out.println("Vida do " + monster.race + ": " + monster.HP);

            System.out.println("O que você deseja fazer? ");
            System.out.println("atacar, defender ou fugir? ");
            String action = scanner.nextLine();

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
                        System.out.println("Você não conseguiu bloquear");
                        // player.setHP(monster.nivel * monster.forca - 1);
                        playerDefendeu = false;
                        System.out.println("Sua vida é " + player.HP);
                    } else {
                        System.out.println("Você conseguiu bloquear");
                        playerDefendeu = true;
                    }
                    break;

                case "fugir":
                    if (player.nivel > monster.nivel) {
                        System.out.println("você conseguiu fugir");
                        return;
                    } else {
                        System.out.println("voce nao conseguiu fugir");
                    }
                    break;

            }
            System.out.println();

            // caso o monstro esteja vivo
            if (monster.HP > 0) {

                // ação do monstro
                System.out.println("O " + monster.race + " está atacando");
                boolean acertou = rand.nextInt(monster.chanceDeAcerto) >= 4 ? true : false; // 50% de chance

                // caso o monstro tenha acertado e o player não tenha conseguido defender
                if (acertou && playerDefendeu == false) {
                    System.out.println("O " + monster.race + " acertou o ataque");
                    player.HP -= monster.ataqueFisico();
                    System.err.println("Você perdeu " + monster.ataqueFisico() + " de vida e tem " + player.HP);
                } else {
                    System.out.println("O " + monster.race + " errou o ataque");
                }

            }
            System.out.println();
        }
        // scanner.close();
    }
}
