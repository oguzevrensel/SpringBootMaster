package com.example.master.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;
    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        // given
        Customer eren = new Customer(
                1l,
                "Eren",
                "Eren123",
                "eren@gmail.com");

        Customer ali = new Customer(
                2l,
                "Ali",
                "Ali123",
                "ali@gmail.com");

        customerRepository.saveAll(Arrays.asList(eren,ali));
        // when
        List<Customer> customers =underTest.getCustomers();
        // then
        assertEquals(2,customers.size());
    }

    @Test
    void getCustomer() {
        // given
        Customer eren = new Customer(
                1l,
                "Eren",
                "Eren123",
                "eren@gmail.com");

        customerRepository.save(eren);

        // when
        Customer actual = underTest.getCustomer(1L);

        // then
        assertEquals(1L,actual.getId());
        assertEquals("Eren",actual.getName());
        assertEquals("Eren123",actual.getPassword());
        assertEquals("eren@gmail.com",actual.getEmail());
    }
}