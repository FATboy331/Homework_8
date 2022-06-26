package kg.geektech.game.players;

public class Magic extends Hero {


private int buff = getDamage();
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);

    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                heroes[i].setDamage(heroes[i].getDamage() + buff);
            }

        }
    }
}
