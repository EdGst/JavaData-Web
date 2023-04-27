package heroesvsmonsters.models.properties;

public class Inventory extends BaseProperty<ItemType, Integer> {


    public void appendItem(ItemType item ,Integer value){

        properties.put(item , getProperty(item) + value);
    }


}
