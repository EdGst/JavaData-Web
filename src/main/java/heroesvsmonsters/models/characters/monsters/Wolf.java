package heroesvsmonsters.models.characters.monsters;

import heroesvsmonsters.models.characters.Entity;
import heroesvsmonsters.models.loots.Leather;
import heroesvsmonsters.models.properties.StatType;
import heroesvsmonsters.utils.Dice;

public class Wolf extends Monster implements Leather {

    private Integer leather;

    Integer attackPower;
    public Wolf() {

        this.leather = Dice.D7.throwDice();

    }

    public Integer attackPower() {

                attackPower = getStats().modifier(StatType.STRENGTH) + Dice.D4.throwDice();

        return attackPower;
    }



    @Override
    public void hit(Entity target) throws Exception {

        int ap = attackPower();


        System.out.println("Le loup attaque l'ennemi lui infligeant " + ap + " de dégâts !");
        target.takeDamage(ap);
        System.out.println("L'ennemi n'a plus que " + target.getCurrentHp() + " points de vie ! ");

    }

    @Override
    public void generate(){
        getStats().appendStat(StatType.AGILITY,3);
        super.generate();
    }


    @Override
    public Integer getLeather() {
        return leather;
    }
}
