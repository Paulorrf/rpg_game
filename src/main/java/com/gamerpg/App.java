package com.gamerpg;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Guerreiro player = new Guerreiro();
        Pocoes pocoes = new Pocoes(1);

        HashMap<String, Integer> value = new HashMap<String, Integer>();

        value = pocoes.createRandomPotion();
        System.out.println(value);

        while (player.HP > 0) {
            Monster monster = new Monster("orc");
            Game game = new Game();

            System.out.println("Você encontrou um " + monster.race);

            game.fightMonster(player, monster);
            System.out.println();
        }
    }
}
