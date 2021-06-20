import animals.Animal;
import animals.Voice;
import except.WrongFoodException;
import foods.Food;

public class Worker {
    public void feed(Food food, Animal animal) throws WrongFoodException {
        System.out.println(animal.getName() + " " + animal.eat(food));
    }

    public void getVoice(Voice animal) {
        Voice voice = animal;
        System.out.println(voice.voice());
    }
}
