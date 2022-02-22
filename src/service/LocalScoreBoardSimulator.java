package service;

import model.Customer;

import java.util.List;
import java.util.Map;

public class LocalScoreBoardSimulator {

    List<Customer> customers;
    Map<String, Integer> ingredient;

    public LocalScoreBoardSimulator(List<Customer> customers, Map ingredient) {
        this.customers = customers;
        this.ingredient = ingredient;
    }

    public int getScore() {
        int customerCount = 0;

        for (Customer customer : customers) {

            Boolean is_selected = true;

            //checking if any ingredient of customer that is not in our selection 
            for (String likedIngredient : customer.getLikedIngredients()) {
                if (!ingredient.containsKey(likedIngredient)) {
                    boolean likedStatus = false;
                    break;
                }
            }

            if(!is_selected) continue;

            //checking if any ingredient of customer that is disliked by customer
            for (String dislikedIngredient : customer.getDislikedIngredients()) {
                if (ingredient.containsKey(dislikedIngredient)) {
                    is_selected = false;
                    break;
                }
            }

            //increase count of customers if that ingredient is 
            //liked by customer and not disliked by that customer
            if (is_selected)
                customerCount++;
        }

        return customerCount;
    }
}