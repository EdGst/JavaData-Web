package heroesvsmonsters;
import heroesvsmonsters.models.characters.heroes.Hero;
import heroesvsmonsters.models.characters.heroes.Warrior;
import heroesvsmonsters.models.characters.monsters.Monster;
import heroesvsmonsters.models.characters.monsters.Wolf;
import heroesvsmonsters.models.properties.Inventory;
import heroesvsmonsters.models.properties.ItemType;


public class main {
    public static void main(String[] args) throws Exception {

        Hero guerrier = new Warrior("Gauthier le barbare");
        Monster wolf = new Wolf();


        wolf.addDieEventSubscriber(monstre -> guerrier.loot(monstre)); // guerrier::loot


        while(wolf.isAlive()){

            guerrier.hit(wolf);


            Inventory inv = new Inventory();
            Integer a = inv.getProperty(ItemType.GOLD);

        }






    }
}
