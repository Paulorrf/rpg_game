package com.gamerpg;

public class Monster extends Classes {
    String race;
    int chanceDeAcerto = 5; // 50%

    Monster(String race) {
        this.race = race;
        setForca(4);
        setAgilidade(4);
        setInteligencia(4);
        setHP(50);
        setMP(20);
        setNivel(2);
        setWeapon("adaga");
    }
}
