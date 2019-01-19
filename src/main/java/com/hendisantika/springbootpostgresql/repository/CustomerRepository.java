package com.hendisantika.springbootpostgresql.repository;

import com.hendisantika.springbootpostgresql.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-postgresql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-20
 * Time: 05:56
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByFirstName(String FirstName);

    List<Customer> findAll();
}