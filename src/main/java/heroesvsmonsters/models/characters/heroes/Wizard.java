package heroesvsmonsters.models.characters.heroes;

import heroesvsmonsters.models.characters.Entity;
import heroesvsmonsters.models.properties.StatType;
import heroesvsmonsters.utils.Dice;

public class Wizard extends Hero {

    Integer attackPower;

    public Wizard(String name) {
        super(name);
        getStats().appendStat(StatType.INTELLIGENCE, 5);

    }


    public Integer attackPower() {

        attackPower = getStats().modifier(StatType.INTELLIGENCE) + Dice.D4.throwDice();

        return attackPower;
    }


    @Override
    public void hit(Entity target) throws Exception {

        int ap = attackPower();

        System.out.println(this.getName() + " attaque l'ennemi lui infligeant " + ap + " de dégâts !");
        target.takeDamage(ap);
        System.out.println("L'ennemi n'a plus que " + target.getCurrentHp() + " points de vie ! ");

    }

    public void generate() {

        getStats().appendStat(StatType.INTELLIGENCE, 5);
        super.generate();
    }
}
