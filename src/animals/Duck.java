package animals;

import aviary.AviarySize;

import java.util.Objects;

public class Duck extends Herbivore implements Fly, Swim, Voice {

    private String name = "Утка";

    private AviarySize sizeAnimal = AviarySize.SMALL;

    public AviarySize getSizeAnimal() {
        return sizeAnimal;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(name + " летит");
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает");
    }

    @Override
    public String voice() {
        return name + " говорит кря";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(name, duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
