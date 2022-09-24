package com.example.master.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
@Primary
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {

        // TODO CONNECT TO REAL DB
        return Collections.singletonList(
                new Customer(1L, "TODO: Implemet real db")

        );
    }
}
