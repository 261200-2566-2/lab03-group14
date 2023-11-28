public class Sword {
    double damage;
    String name;
    int level=1;

    Sword(String _name,int baseDamage){
        name = _name;
        damage = baseDamage;
    }
    void levelUp() {
        damage = damage*(1+(0.1*level));
    }
}