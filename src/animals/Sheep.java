package animals;

import aviary.AviarySize;

import java.util.Objects;

public class Sheep extends Herbivore implements Run, Voice {
    private String name = "Овца";

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
        return name + " говорит Беее";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return Objects.equals(name, sheep.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
