package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerServiceImpl extends CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }



    @Override
    public Customer save(Customer customer) throws CustomerExistsException {
        /*
        1. check if customer exists
        2. if exist then throw exception
        3. if not exist then save customer

         */
        if (customerRepository.existsByEmail(customer.getEmail()) != null)
            throw new CustomerExistsException("Customer already exists with Email: " + customer.getEmail());

        return customerRepository.save(customer);
    }
}
