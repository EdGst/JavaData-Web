package heroesvsmonsters.models.characters;
import heroesvsmonsters.models.characters.heroes.Hero;
import heroesvsmonsters.models.characters.monsters.Monster;
import heroesvsmonsters.models.interfaces.DieEventSubscriber;
import heroesvsmonsters.models.properties.Inventory;
import heroesvsmonsters.models.properties.StatType;
import heroesvsmonsters.models.properties.Stats;
import heroesvsmonsters.utils.Dice;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {

    private Stats stats;
    private Inventory loots;
    private Integer currentHp;
    private Integer currentSp;
    private final List<DieEventSubscriber> dieEvent = new ArrayList<>();

    public Entity(){
        this.stats = new Stats();
        generate();
        regen();
    }

    public Integer getCurrentHp(){
        return currentHp;
    }
    private void setCurrentHp(Integer value){

        // currentHp = value < 0 ? 0 : value > getHp() ? getHp() : value ;   // équivalent à if else avec un return
        // value < 0  ---> est-ce que value est inférieur à 0 ?
        // ? 0        ---> donner la valeur de 0 si oui             : value  ---> sinon donner la valeur de value

        currentHp = value < 0 ? 0 : Math.min(getHp(), value);

        // Prend la plus petite valeur entre getHp() et la valeur pour définir les hp (si value > à getHp ce n'est pas correcte d'augmenter les hp de bases)
    }
    private void setCurrentSp(Integer value) {

        currentSp = value < 0 ? 0 : Math.min(getHp(), value);
    }
    public void takeDamage(Integer amount) throws Exception {


        if(currentHp == null)
            return;
        if(amount < 0)
            return;

        setCurrentHp(getCurrentHp() - amount);

        if (!isAlive() ){
            raiseDieEventSubscriber();
        }


    }
    public Integer getHp(){
        return stats.getStat(StatType.HP);
    }
    public Integer getMana(){
        return stats.getStat(StatType.MANA);
    }
    public Integer getStrength (){
        return  stats.getStat(StatType.STRENGTH);
    }
    public Integer getAgility (){
        return  stats.getStat(StatType.AGILITY);
    }
    public Integer getIntelligence (){
        return stats.getStat(StatType.INTELLIGENCE);
    }
    public Stats getStats(){
        return stats;
    }
    public Inventory getLoots(){
        return loots;
    }
    public void regen(){
        setCurrentHp(getHp());
        setCurrentSp(getMana());
    }
    public boolean isAlive(){

        return getCurrentHp() > 0;


    }
    protected void generate(){

        if (this instanceof Hero)
            getStats().generate(Dice.D6);
        if (this instanceof Monster)
            getStats().generate(Dice.D4);

    }




    public void raiseDieEventSubscriber(){

        for (DieEventSubscriber subscriber : dieEvent){

            subscriber.execute(this);
        }
    }

    public void addDieEventSubscriber(DieEventSubscriber looting){

        dieEvent.add(looting);
    }

    public abstract void hit(Entity target) throws Exception;

}
