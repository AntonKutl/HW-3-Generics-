package animals;

import aviary.AviarySize;

import java.util.Objects;

public class Fox extends Carnivorous implements Voice, Run {

    private String name = "Лиса";

    private AviarySize sizeAnimal = AviarySize.SMALL;

    public AviarySize getSizeAnimal() {
        return sizeAnimal;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Лиса бежит");
    }

    @Override
    public String voice() {
        return name + " говорит Гав";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fox fox = (Fox) o;
        return Objects.equals(name, fox.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
