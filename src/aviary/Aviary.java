package aviary;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T> {

    private AviarySize sizeAviary;

    public Aviary(AviarySize sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    private Map<String, T> map = new HashMap<String, T>();

    public void addAnimal(String name, T animal, AviarySize size) {
        if (sizeAviary == size) {
            map.put(name, animal);
            System.out.println(name + " добавлено");
        } else {
            System.out.println("Вольер не подходит для " + name);
        }
    }

    public void deleteAnimal(String name) {
        map.remove(name);
        System.out.println(name + " удалено");
    }

    public T getAnimal(String name) {
        return map.get(name);
    }

}
