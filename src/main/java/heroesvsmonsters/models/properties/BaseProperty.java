package heroesvsmonsters.models.properties;

import java.util.HashMap;
import java.util.Map;

public class BaseProperty<Tkey, Tvalue> {  // type de key, et type value


    protected final Map<Tkey, Tvalue> properties;

    public BaseProperty() {
        this.properties = new HashMap<>();
    }

    public Tvalue getProperty(Tkey key){
        if (!properties.containsKey(key))
            throw new RuntimeException();

        return  properties.get(key);
    }

    protected void setProperty(Tkey key , Tvalue value){

        properties.put(key, value);
    }



}
