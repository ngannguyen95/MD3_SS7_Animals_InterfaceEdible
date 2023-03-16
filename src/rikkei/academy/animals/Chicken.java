package rikkei.academy.animals;

import rikkei.academy.edible.IEdble;

public class Chicken extends Animals implements IEdble {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "có thể chiên giòn";
    }
}
