package com.gamerpg;

public class Weapon {
    String type;
    int damage;

    Weapon(String type) {
        this.type = type;
        setDamage(type);
    }

    void setDamage(String type) {
        if (type == "machado") {
            this.damage = 20;
        } else if (type == "cajado") {
            this.damage = 10;
        } else if (type == "adaga") {
            this.damage = 14;
        }
    }
}
