package com.hendisantika.springbootpostgresql.controller;

import com.hendisantika.springbootpostgresql.model.Customer;
import com.hendisantika.springbootpostgresql.model.CustomerUI;
import com.hendisantika.springbootpostgresql.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-postgresql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-20
 * Time: 05:57
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class CustomerController {
    @Autowired
    CustomerRepository repository;

    @GetMapping("/bulkcreate")
    public String bulkcreate() {
        // save a single Customer
        repository.save(new Customer("Uzumaki", "Naruto"));

        // save a list of Customers
        repository.saveAll(Arrays.asList(new Customer("Uchiha", "Sasuke")
                , new Customer("Haruno", "Sakura")
                , new Customer("Hatake", "Kakashi")
                , new Customer("Namikaze", "Minato")));

        return "Customers are created";
    }

    @PostMapping("/create")
    public String create(@RequestBody CustomerUI customer) {
        // save a single Customer
        repository.save(new Customer(customer.getFirstName(), customer.getLastName()));

        return "Customer is created";
    }

    @GetMapping("/findall")
    public List<CustomerUI> findAll() {

        List<Customer> customers = repository.findAll();
        List<CustomerUI> customerUI = new ArrayList<>();

        setData(customers, customerUI);

        return customerUI;
    }

    private void setData(List<Customer> customers, List<CustomerUI> customerUI) {
        for (Customer customer : customers) {
            customerUI.add(new CustomerUI(customer.getFirstName(), customer.getLastName()));
        }
    }

    @RequestMapping("/search/{id}")
    public String search(@PathVariable long id) {
        String customer = "";
        customer = repository.findById(id).toString();
        return customer;
    }

    @RequestMapping("/searchbyfirstname/{firstname}")
    public List<CustomerUI> fetchDataByLastName(@PathVariable String firstname) {

        List<Customer> customers = repository.findByFirstName(firstname);
        List<CustomerUI> customerUI = new ArrayList<>();

        setData(customers, customerUI);

        return customerUI;
    }
}