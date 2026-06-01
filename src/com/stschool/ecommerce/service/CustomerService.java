package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.exception.CustomerNotFoundException;
import com.stschool.ecommerce.exception.InvalidCredentialsException;
import com.stschool.ecommerce.model.Customer;

public class CustomerService {
    public Customer save(Customer customer) throws CustomerExistsException {

        throw new CustomerExistsException("Customer already Exists");
    }

    public Customer login(String email, String password) {

        return null;
    }
}
