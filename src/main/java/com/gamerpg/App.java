package com.gamerpg;

public class App {
    public static void main(String[] args) {
        Guerreiro player = new Guerreiro();

        while (player.HP > 0) {
            Monster monster = new Monster("orc");
            Game game = new Game();

            System.out.println("Você encontrou um " + monster.race);

            game.fightMonster(player, monster);
            System.out.println();

        }
    }
}
