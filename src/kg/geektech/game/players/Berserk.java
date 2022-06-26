package kg.geektech.game.players;

import java.util.Random;

public class Berserk extends Hero {



    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);


    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
     int bossDamage = boss.getDamage() / 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                boss.setHealth(boss.getHealth() - bossDamage);
                break;
            }

        }
    }
}
