package animals;

import except.WrongFoodException;
import foods.Food;

public abstract class Animal {

    public abstract String eat(Food food) throws WrongFoodException;

    public abstract String getName();

}
