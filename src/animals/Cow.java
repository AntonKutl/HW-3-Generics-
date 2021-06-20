package animals;

import aviary.AviarySize;

import java.util.Objects;

public class Cow extends Herbivore implements Run, Voice {

    private String name = "Корова";

    private AviarySize sizeAnimal=AviarySize.LARGE;

    public AviarySize getSizeAnimal() {
        return sizeAnimal;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public String voice() {
        return name + " говорит Му";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
