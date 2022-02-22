package model;

import java.util.List;

public class Customer {
    private final List<String> likedIngredients;
    private final List<String> dislikedIngredients;

    public Customer(List<String> likedIngredients, List<String> dislikedIngredients) {
        this.likedIngredients = likedIngredients;
        this.dislikedIngredients = dislikedIngredients;
    }

    public List<String> getLikedIngredients() {
        return likedIngredients;
    }

    public List<String> getDislikedIngredients() {
        return dislikedIngredients;
    }

}
