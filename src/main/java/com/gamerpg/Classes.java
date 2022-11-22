package com.gamerpg;

public class Classes {

    int forca;
    int agilidade;
    int inteligencia;
    int HP;
    int MP;
    int nivel;
    Weapon weapon;

    Classes() {
        this.nivel = 1;
    }

    int ataqueFisico() {
        return forca;
    }

    void setForca(int forca) {
        this.forca = forca;
    }

    void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    void setHP(int HP) {
        this.HP = HP;
    }

    void setMP(int MP) {
        this.MP = MP;
    }

    void setNivel(int nivel) {
        this.nivel = nivel;
    }

    void setWeapon(String type) {
        weapon = new Weapon(type);
    }

}
