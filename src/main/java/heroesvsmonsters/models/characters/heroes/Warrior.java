package heroesvsmonsters.models.characters.heroes;

import heroesvsmonsters.models.characters.Entity;
import heroesvsmonsters.models.properties.StatType;
import heroesvsmonsters.utils.Dice;

public class Warrior extends Hero {

    Integer attackPower;

    public Warrior(String name) {

        super(name);

    }

    public Integer attackPower() {

        attackPower = getStats().modifier(StatType.STRENGTH) + Dice.D4.throwDice();

        return attackPower;
    }


    @Override
    public void hit(Entity target) throws Exception {

        int ap = attackPower();

        System.out.println(this.getName() + " attaque l'ennemi lui infligeant " + ap + " de dégâts !");
        target.takeDamage(ap);
        System.out.println("L'ennemi n'a plus que " + target.getCurrentHp() + " points de vie ! ");

    }

    @Override
    public void generate() {

        getStats().appendStat(StatType.STRENGTH, 5);
        super.generate();
    }

}
