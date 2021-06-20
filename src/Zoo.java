import animals.*;
import aviary.Aviary;
import aviary.AviarySize;
import except.WrongFoodException;
import foods.Banana;
import foods.Pork;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {

        Cow cow = new Cow();
        Duck duck = new Duck();
        Fox fox = new Fox();
        Pike pike = new Pike();
        Sheep sheep = new Sheep();
        Wolf wolf = new Wolf();
        Banana banana = new Banana();
        Pork pork = new Pork();


        Worker worker = new Worker();
        worker.getVoice(wolf);
//        worker.feed(pork, cow);
        worker.feed(banana, cow);
        worker.feed(pork, fox);
//        worker.feed(banana, fox);

        Swim[] animals = {pike, duck};
        for (Swim animal : animals) {
            animal.swim();
        }

        Aviary<Carnivorous> animalCarnivorous = new Aviary(AviarySize.MEDIUM);
        Aviary<Herbivore> animalHerbivore = new Aviary(AviarySize.LARGE);
        animalCarnivorous.addAnimal(wolf.getName(), wolf, wolf.getSizeAnimal());
        animalHerbivore.addAnimal(cow.getName(), cow, cow.getSizeAnimal());
        animalHerbivore.deleteAnimal(cow.getName());

        System.out.println(animalCarnivorous.getAnimal(wolf.getName()));
    }
}
