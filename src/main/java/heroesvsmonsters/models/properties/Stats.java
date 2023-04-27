package heroesvsmonsters.models.properties;

import heroesvsmonsters.models.characters.Entity;
import heroesvsmonsters.models.characters.heroes.Hero;
import heroesvsmonsters.utils.Dice;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class Stats extends BaseProperty<StatType , Integer> {



    public void appendStat(StatType stat ,Integer value){

        properties.put(stat , getProperty(stat) + value);
    }

    public void generateStat(){

        setProperty(StatType.HP, Dice.D6.throwDices(5,3));
        setProperty(StatType.MANA, Dice.D6.throwDices(5,3));
        setProperty(StatType.STRENGTH, Dice.D6.throwDices(5,3));
        setProperty(StatType.INTELLIGENCE, Dice.D6.throwDices(5,3));
        setProperty(StatType.AGILITY, Dice.D6.throwDices(5,3));

    }

    public void generate(Dice dice){

        for(StatType s : StatType.values()){
            if (s != StatType.HP && s != StatType.MANA)
                appendStat(s,dice.throwDices(5,3));
        }
        setProperty(StatType.HP, (getProperty(StatType.STRENGTH)*3));
        setProperty(StatType.MANA, (getProperty(StatType.MANA)*3));

    }



    public Integer modifier(StatType stat){

        return (getProperty(stat) / 5);
    }

    public void afficherPerso(Entity entity){


        if (entity instanceof Hero){  // si l'entité est un héro alors
            System.out.println(((Hero) entity).getName());
        }


        for (StatType s : StatType.values()){

            System.out.println(s.getNom() + " : " + properties.get(s));

        }
        System.out.println("_________________________________");
    }

}
