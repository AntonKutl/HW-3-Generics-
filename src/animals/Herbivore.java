package animals;

import except.WrongFoodException;
import foods.Food;
import foods.Grass;

public abstract class Herbivore extends Animal {


    @Override
    public String eat(Food food) throws WrongFoodException {

        if (food instanceof Grass) {
            return " съела " + food.getName();
        } else {
            throw new WrongFoodException(" не ест " + food.getName());
        }
    }
}
