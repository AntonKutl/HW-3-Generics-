package animals;

import aviary.AviarySize;

import java.util.Objects;

public class Wolf extends Carnivorous implements Run, Voice {
    private String name = "Волк";

    private AviarySize sizeAnimal = AviarySize.MEDIUM;

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
        return name + " говорит Гав";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(name, wolf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
