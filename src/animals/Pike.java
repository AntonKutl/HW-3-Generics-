package animals;

import aviary.AviarySize;

import java.util.Objects;

public class Pike extends Carnivorous implements Swim {
    private String name = "Щука";

    private AviarySize sizeAnimal = AviarySize.SMALL;

    public AviarySize getSizeAnimal() {
        return sizeAnimal;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pike pike = (Pike) o;
        return Objects.equals(name, pike.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
