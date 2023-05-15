package com.isep.hpah.core;

import java.util.Random;

public class Enemy extends AbstractEnemy{


    public Enemy(String characterName, int healthPoints, int maxHealthPoints, int manaPoints, int accuracy, int attackPoints, int defense, int level) {
        super(characterName, healthPoints, maxHealthPoints, manaPoints, accuracy, attackPoints, defense, level);

    }

    @Override
    public boolean isDead() {
        return super.isDead();
    }

    @Override
    public String attack(Character target, Spell spellUsed) {
        return null;
    }

    @Override
    public void attack() {
        super.attack();
    }


}
