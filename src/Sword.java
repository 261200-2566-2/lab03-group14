public class Sword {
    public double damage;
    public final String name;
    public int level=1;

    public Sword(String _name,int baseDamage){
        name = _name;
        damage = baseDamage;
    }
    public void levelUp() {
        damage = damage*(1+(0.1*level));
    }
}