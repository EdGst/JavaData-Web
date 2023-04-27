package heroesvsmonsters.models.characters.heroes;

import heroesvsmonsters.models.characters.Entity;
import heroesvsmonsters.models.loots.Gold;
import heroesvsmonsters.models.loots.Leather;

public abstract class Hero extends Entity {

    private String name;

    private Integer gold = 0;

    private Integer leather = 0;

    public Hero(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public void loot(Entity target){

        if(target instanceof Gold g){
            gold += g.getGold();
            System.out.println("Je loot " + g.getGold() + " pièce(s) d'or. ");
        }

        if(target instanceof Leather l){
            leather += l.getLeather();
            System.out.println("Je loot " + l.getLeather() + " cuir(s). ");
        }

        regen();


    }



}
