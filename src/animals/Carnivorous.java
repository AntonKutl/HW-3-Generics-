package animals;

import except.WrongFoodException;
import foods.Food;
import foods.Meat;

public abstract class Carnivorous extends Animal {

    @Override
    public String eat(Food food) throws WrongFoodException {

        if (food instanceof Meat) {
            return " съела " + food.getName();
        } else {
            throw new WrongFoodException(" не ест " + food.getName());
        }
    }
}
