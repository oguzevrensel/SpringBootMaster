package com.example.master.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
            new Customer(1L, "James Bond", "password123"),
                new Customer(2L, "Oguz Evrensel", "123password")
        );
    }
}
