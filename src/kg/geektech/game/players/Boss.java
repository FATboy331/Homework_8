package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class
Boss extends GameEntity {
    private SuperAbility defenceType;


    private boolean stun;

    public boolean isStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void hit(Hero[] heroes) {
        if (!this.stun) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0) {
                    heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
                }
            }
        } else {
            stun = false;
        }
    }
    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        setDefenceType(heroes[randomIndex].getAbilityType());
    }

    public SuperAbility getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(SuperAbility defenceType) {
        this.defenceType = defenceType;
    }

    @Override
    public String toString() {
        return super.toString() + " defence: " + (this.defenceType == null ? "NO" : this.defenceType) ;
    }
}
