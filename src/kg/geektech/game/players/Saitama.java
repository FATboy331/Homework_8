package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Saitama extends Hero{


    public Saitama(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.ONE_PUNCH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int solution = RPG_Game.random.nextInt(30) + 1;
        int сhance = 19;
        int punch = 100000000;
        if(solution == сhance){
            boss.setHealth(boss.getHealth() - (this.getDamage() + punch));
            System.out.println("Saitama решил ударить "
                    + this.getDamage() + punch);
        }
    }
}
