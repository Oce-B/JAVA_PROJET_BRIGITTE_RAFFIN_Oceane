package com.isep.hpah.core;

import java.util.List;

public class Spell extends AbstractSpell{


   private int spellLevel;
   private Wizard wizard;

    private int manaCost;
    public Spell(){
        this.spellLevel=1;
    }




    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }




}
