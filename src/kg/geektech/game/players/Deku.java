package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Deku extends Hero{

    public Deku(String name, int health, int damage) {
        super(name, health, damage,SuperAbility.UP_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        double[] deadLine = {0.2, 0.5, 1.0};
       int random = RPG_Game.random.nextInt(2);
        boolean chans = RPG_Game.random.nextBoolean();
        if (chans && this.getHealth() > 0){
            this.setDamage((int)(this.getDamage() * deadLine[random]));
            this.setHealth((int)(this.getHealth() - this.getHealth() * deadLine[random]));
            System.out.println("Deku увеличил урон на " + deadLine[random] * 100 + '%' );
        }

    }
}
