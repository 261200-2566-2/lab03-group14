public class Character {
    String name;
    int level;
    double hp;
    double mana;
    double runSpeed;
    double defRunSpeed;
    double maxHp;
    double maxMana;
    double maxRunSpeed;
    Sword equippedSword;
    Shield equippedShield;
    void levelUp() {
        level++;
        maxHp = 100+(10*level);
        maxMana = 50+(2*level);
        maxRunSpeed = runSpeed+(0.1+(0.03*level));

    }
    void attack(Character target) {
        double damageDealt = 0;
        if(equippedSword == null){
            System.out.println(name + " can't attack without a sword");
        }
        else if (target.equippedShield != null) {
            damageDealt += equippedSword.damage-target.equippedShield.defense;
        }
        else {
            damageDealt += equippedSword.damage;
        }

        // You can add more logic for additional damage sources (e.g., spells, items)

        // Reduce target's HP
        target.hp -= damageDealt;
        if(target.hp <= 0) {
            System.out.println(target.name + " is now dead");
        }
    }
    Character(String _name,int _level,double _baseRunSpeed){
        name = _name;
        level = _level;
        runSpeed = _baseRunSpeed;
        defRunSpeed = _baseRunSpeed;

        maxHp = 100+(10*level);
        hp = maxHp;
        maxMana = 50+(2*level);
        mana = maxMana;
        maxRunSpeed = runSpeed+(0.1+(0.03*level));
    }
    void equipSword(Sword sword) {
        equippedSword = sword;
        runSpeed -= runSpeed * (0.1 + (0.04 * level));
    }

    void equipShield(Shield shield) {
        equippedShield = shield;
        runSpeed -= runSpeed * (0.1 + (0.06 * level));
    }
    void unEquipSword(Sword sword){
        if(equippedSword == sword){
            equippedSword = null;
        }else{
            System.out.println(name+" hasn't equipped "+sword.name+" sword");
        }
        runSpeed = defRunSpeed;
    }
    void unEquipShield(Shield shield){
        if(equippedShield == shield){
            equippedShield = null;
        }else{
            System.out.println(name+" hasn't equipped "+shield.name+" shield");
        }
        runSpeed = defRunSpeed;
    }
}
