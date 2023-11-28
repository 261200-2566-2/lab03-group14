public class Shield {
    double defense;
    String name;
    int level=1;

    Shield(String _name,int baseDefense){
        name = _name;
        defense = baseDefense;
    }
    void levelUp() {
        defense = defense*(1+(0.05*level));
    }
}