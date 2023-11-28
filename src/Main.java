// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Character A = new Character("King",10,1);
        Character B = new Character("Queen",10,1);
        System.out.println(A.name);
        System.out.println(B.name);
        Sword E = new Sword("Exe",50);
        Sword P = new Sword("pp",50);
        Shield S = new Shield("shh",10);
        System.out.println("King's Sword : "+E.damage);
        A.attack(B);
        System.out.println("Queen's hp : "+B.hp);
        System.out.println("King runSpeed : "+A.runSpeed);
        System.out.println("Queen runSpeed : "+B.runSpeed);
        A.equipSword(E);
        B.equipShield(S);
        System.out.println("King runSpeed : "+A.runSpeed);
        System.out.println("Queen runSpeed : "+B.runSpeed);
        System.out.println("King's damage : "+E.damage);
        System.out.println("Queen's defense : "+S.defense);
        A.attack(B);
        System.out.println("Queen's hp : "+B.hp);
        A.unEquipSword(P);
        A.attack(B);
        System.out.println("Queen's hp : "+B.hp);
        A.unEquipSword(E);
        B.unEquipShield(S);
        System.out.println("King runSpeed : "+A.runSpeed);
        System.out.println("Queen runSpeed : "+B.runSpeed);

//        System.out.println("level : "+A.level);
//        System.out.println("maxHp : "+A.maxHp);
//        System.out.println("maxMana : "+A.maxMana);
//        System.out.println("maxRunSpeed : "+A.maxRunSpeed);
//        A.levelUp();
//        System.out.println("level : "+A.level);
//        System.out.println("maxHp : "+A.maxHp);
//        System.out.println("maxMana : "+A.maxMana);
//        System.out.println("maxRunSpeed : "+A.maxRunSpeed);

//        System.out.println("runSpeed : "+A.runSpeed);
//        System.out.println("maxRunSpeed : "+A.maxRunSpeed);
//        A.useSword();
//        System.out.println("runSpeed + useSword : "+A.runSpeed);
//        A.useNoSword();
//        System.out.println("runSpeed + useNoSword: "+A.runSpeed);
//        System.out.println("runSpeed : "+A.runSpeed);
//        A.useShield();
//        System.out.println("runSpeed + useShield : "+A.runSpeed);
//        A.useNoShield();
//        System.out.println("runSpeed + useNoShield: "+A.runSpeed);
//        A.useShield();
//        A.useSword();
//        System.out.println("runSpeed both equip: "+A.runSpeed);

    }
}