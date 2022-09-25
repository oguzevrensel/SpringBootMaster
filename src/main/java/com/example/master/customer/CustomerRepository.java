package com.example.master.customer;

import java.util.Collections;
import java.util.List;


public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {

        // TODO CONNECT TO REAL DB
        return Collections.singletonList(
                new Customer(1L, "TODO: Implemet real db", "todo","email@gmail.com")

        );
    }
}
