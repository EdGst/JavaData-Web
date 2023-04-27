package heroesvsmonsters.models.interfaces;

import heroesvsmonsters.models.characters.Entity;

public interface DieEventSubscriber {

    void execute(Entity entity);  //  on veut abonner loot à notre événements, loot étant une méthode qui retourne void et qui reprend une entity en paramettre

}
