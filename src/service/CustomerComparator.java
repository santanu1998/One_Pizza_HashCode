package service;

import model.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer customer1, Customer customer2) {

        if(customer1.getDislikedIngredients().size() == customer2.getDislikedIngredients().size()){
            return customer1.getLikedIngredients().size()-customer2.getLikedIngredients().size();
        }

        return customer1.getDislikedIngredients().size() - customer2.getDislikedIngredients().size();
    }
}