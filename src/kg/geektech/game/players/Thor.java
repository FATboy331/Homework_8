package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{

    public Thor(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
       boolean stun = RPG_Game.random.nextBoolean();
       if(stun && this.getHealth() > 0){
           boss.setStun(true);
           System.out.println("Тор оглушил босса");
       }
        }

    }

